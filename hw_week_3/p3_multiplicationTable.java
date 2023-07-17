package hw_week_3;

public class p3_multiplicationTable {
    public static void main(String[] args) {
        // int count = 0;
        int total = 1;
        for (int i = 1; i < 11; i++) {
            System.out.print(i + " ");
            for (int j = 2; j < 11; j++) {
                // count++;
                total = i * j;
                String aligned_tedTotal = String.format("%4d", total);// cant figure out why the double digits are
                                                                             // gettin wacky
                System.out.print(aligned_tedTotal);
            }
            System.out.print("\n");
        }
    }
}