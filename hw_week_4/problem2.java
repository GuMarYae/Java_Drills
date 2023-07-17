import java.util.ArrayList;

public class problem2 {
    public static void shiftStrings(ArrayList<String> strings) {
        int currentIndex = 0;

        for (int i = 0; i < strings.size(); i++) {
            String currentString = strings.get(i);

            if (Character.isUpperCase(currentString.charAt(0))) {
                strings.remove(i);
                strings.add(currentIndex, currentString);
                currentIndex++;
            }
        }
    }

    public static void main(String[] args) {
        // Test the moveStrings method
        ArrayList<String> strings = new ArrayList<>();
        strings.add("Today");
        strings.add("nU");
        strings.add("University");
        strings.add("cheese");
        strings.add("Foo");
        strings.add("hello");
        strings.add("C++");
        strings.add("is");
        strings.add("Better");

        System.out.println("Before: " + strings);

        shiftStrings(strings);

        System.out.println("After: " + strings);
    }

}
