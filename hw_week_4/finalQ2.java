package hw_week_4;

public class finalQ2 {
    public static void main(String[] args) {
        // all the even
        for (int i = 2; i <= 20; i += 2) {
            System.out.println(i);
        }

        // pos, neg, else 0
        int num = 199;
        if (num > 0) {
            System.out.println(num + " is a positive number");
        } else if (num < 0) {
            System.out.println(num + " is a negative number");
        } else {
            System.out.println(num + " is zero\n");
        }
        num = -198;
        if (num > 0) {
            System.out.println(num + " is a positive number");
        } else if (num < 0) {
            System.out.println(num + " is a negative number");
        } else {
            System.out.println(num + " is zero\n");
        }
        int[] numbers = { 4, 9, 2, 7, 5 };
        for (int i = 0; i < numbers.length; i++)
            System.out.println(numbers[i]);
        // getting the sum in the array
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println(sum);

    }

}
