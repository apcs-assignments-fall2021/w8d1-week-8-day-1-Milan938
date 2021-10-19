import java.util.Scanner;

public class MyMain {

    // Generates a random number between 10 and 20, inclusive
    public static int randomTeen() {
        int sally = (int) (Math.random() * 11) + 10;
        return sally;
    }

    // Use your previous method to generate three random numbers between 10 and 20, inclusive.
    // Your program should print out the three numbers, as well as the largest and smallest
    // values of the three.
    // Example of running your code:
    // The three random numbers are 20, 14, and 10
    // The largest number is 20
    // The smallest number is 10
    public static void main(String[] args) {
        int x = randomTeen();
        int y = randomTeen();
        int z = randomTeen();
        System.out.println(x + " " + y + " " + z);
        System.out.println(Mathey.max(x, Mathey.max(y, z)));
        System.out.println(Math.min(x, Math.min(y, z)));

         System.out.println("Mathey.max tests");
         System.out.println(Mathey.max(1, 2)); // 2
         System.out.println(Mathey.max(2, 1)); // 2

        System.out.println("Mathey.max3 tests");
        System.out.println(Mathey.max(3, 6, 2));
        System.out.println(Mathey.max(92, 77, 0));

        System.out.println("Mathey.max double2");
        System.out.println(Mathey.max(5.3, 7.3));
        System.out.println(Mathey.max(9.0, 3.2));

        System.out.println("Mathey.max double4");
        System.out.println(Mathey.max(9.0, 33.5, 292.0, 17.8));
        System.out.println(Mathey.max(33.9, 2728.9, 12.4, 732.9));

        System.out.println("Mathey.randominteger 2");
        System.out.println(Mathey.randominteger(3, 9));
        System.out.println(Mathey.randominteger(9, 90));

        System.out.println("Mathey.randominteger 1");
        System.out.println(Mathey.randominteger(33));
        System.out.println(Mathey.randominteger(89));

        System.out.println("PowPow");
        System.out.println(Mathey.powpow(2, 5));
        System.out.println(Mathey.powpow(3, 2));

        System.out.println("Absolute Value");
        System.out.println(Mathey.abs(9));
        System.out.println(Mathey.abs(-65));

        System.out.println("Round");
        System.out.println(Mathey.round(8.7));
        System.out.println(Mathey.round(3.4));

        System.out.println("Round Down");
        System.out.println(Mathey.rounddown(2.3));
        System.out.println(Mathey.rounddown(9.8));

        System.out.println("Ceiling");
        System.out.println(Mathey.ceiling(9.999999));
        System.out.println(Mathey.ceiling(32.2));

        System.out.println("Square Root");
        System.out.println(Mathey.sqrt(9.0));
        System.out.println(Mathey.sqrt(36.0));

        System.out.println("Pythag");
        int d = Mathey.powpow(5, 2) + Mathey.powpow(12, 2);
        System.out.println(Mathey.sqrt(d));
    }

}


