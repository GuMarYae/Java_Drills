public class p262Arrays {
    public static void main(String[] args) {
        // i did thei and it still worked but maybe theres a reason why the book is
        // showing the other one
        // int numberArr[] = { 1, 2, 3, 4, 5, 6, 76, 78 };
        // Note 🗯 the trying toi compile with java java p262Arrays
        // this works though java p262Arrays

        // it says youll want to store the array in a variable so that you can access it
        // later. but i thought i was without adding the "new" smh, java smh
        // ok so you can do int numberArr[] = { 1, 2, 3, 4, 5, 6, 76, 78 }; without the
        // "new" operator as long as you assign each element with values

        //the real way using new is int numberArr[] = new int[#] while # is determining the length\
        //and you doint add any numers to the array
        int numberArr[] = new int[] { 1, 2, 3, 4, 5, 6, 76, 78 };
        String arrName [] ={"t","o","n","y"};

        for (int i = 0; i < numberArr.length; i++) {
            System.out.println(i);
        }

        //cool trick i jus thought of

        int values[]= new int[10];
        values[values.length-1]=754563287;
        System.out.println(values[9]);
       

    }
}
