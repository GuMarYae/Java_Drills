package hw_week_4;

import java.io.*;
import java.util.*;

public class problem4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the file name: ");
        String fileName = scanner.nextLine();
        scanner.close();

        try {
            File file = new File(fileName);
            Scanner fileScanner = new Scanner(file);

            List<Double> column1 = new ArrayList<>();
            List<Double> column2 = new ArrayList<>();

            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                String[] parts = line.split("\\s+");
                if (parts.length != 2) {
                    System.out.println("Invalid format: " + line);
                    continue;
                }
                try {
                    double value1 = Double.parseDouble(parts[0]);
                    double value2 = Double.parseDouble(parts[1]);
                    column1.add(value1);
                    column2.add(value2);
                } catch (NumberFormatException e) {
                    System.out.println("Invalid number format: " + line);
                }
            }
            fileScanner.close();

            double average1 = calculateAverage(column1);
            double average2 = calculateAverage(column2);

            System.out.println("Average of column 1:\n" + average1);
            System.out.println("Average of column 2:\n" + average2);

            PrintWriter writer = new PrintWriter(new FileWriter("averages.txt"));
            writer.println("Average of column 1:\n" + average1);
            writer.println("Average of column 2:\n" + average2);
            writer.close();
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }

    public static double calculateAverage(List<Double> values) {
        if (values.isEmpty()) {
            return 0.0;
        }
        double sum = 0.0;
        for (double value : values) {
            sum += value;
        }
        return sum / values.size();
    }

}
