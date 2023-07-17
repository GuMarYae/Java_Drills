package hw_week_4;

public class problem3 {
    public static void swapRows(int[][] array, int row1, int row2) {
        /*
         * remember,    temp = a
         *              a = b
         *              b = temp
         */
        int[] temp = array[row1];
        array[row1] = array[row2];
        array[row2] = temp;
    }

    public static void printArr(int[][] array) {
        //6.2 page 269
        //for each "row" in array
        for (int[] row : array) {
        //fpr each "element" in array
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Test the swapRows method
        int[][] array = {
                { 21, 3, 78 },
                { 7, 544, 64564 },
                { 10000000, -1, 7 }
        };

        System.out.println("Before swapping:");
        printArr(array);

        swapRows(array, 0, 2);

        System.out.println("After swapping:");
        printArr(array);
    }

}
