package polymorph1;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

class Bird {
    public Bird() {
        // this will be called because of line 25 and 28
        System.out.println("Bruh, we have no fingers!");
    };

    public void sing() {
        System.out.println("Tweet tweet");
    }
}

class Robin extends Bird {
    public void sing() {
        super.sing();
        // so my guess is you call super in this scenerio, it calles the function
        // from the Base Class then comes back down and uses this system out as well
        System.out.println("Who the hell says tweet fkn tweet");
    }
}

public class polymorph {
    
    public static void main(String[] args) {
        Bird b1 = new Bird();
        b1.sing();

        Bird b2 = new Robin();
        b2.sing();
        

    }


}

