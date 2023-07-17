import java.util.Scanner;

public class _scratchpaper3 {

    // function
    public static void boxString(String contents) {
        int n = contents.length();
        for (int i = 0; i < n + 2; i++) {
            System.out.print("-");
        }
        System.out.println();
        System.out.println("!" + contents + "!");
        for (int i = 0; i < n + 2; i++) {
            System.out.print("-");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        ////////////////////////////////////////
        boxString("I get it, its fire");
        ////////////////////////////////////////

    }
}
