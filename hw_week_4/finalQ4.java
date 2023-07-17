package hw_week_4;

import java.util.ArrayList;

public class finalQ4 {
    public static void main(String[] args) {
        int[] numbers = { 5, 2, 8, 3, 9 };
        int max = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        System.out.println("The largest number is: " + max);

        ArrayList<String> colors = new ArrayList<String>();
        colors.add("red");
        colors.add("green");
        colors.add("blue");
        colors.add("yellow");
        System.out.println(colors);
        // print each color in the array
        //6.8 page 302 get function()
        for (int i = 0; i < colors.size(); i++) {
            System.out.println(colors.get(i));
        }

    }

}
