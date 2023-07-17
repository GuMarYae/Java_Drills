package hw_week_2.midterm.p1;
//this is just for repetition to remember as im definetely more use to c++ and javascript

//and python for that matter

import java.util.Scanner;
import java.math.BigDecimal;
import java.math.BigInteger;

public class result {
    public static void main(String[] args) {
        double x = 1;
        double y = 3;
        double z = (-1);
        // -1^4 = -1... Java is taking it like (-1)^4 which is 1
        // since the Math.pow is taking -1 like "(-1)", multiply the pow method by -1 no
        // matter what the number is
        double result = (-1 * (Math.pow(z, 4)) + Math.pow(y, 3) + Math.pow(Math.pow(x, 2) - y, 3)) - 11;
        System.out.println(result);

    }

}
