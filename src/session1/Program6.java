package session1;

/**
 * This program demonstrates rounding errors
 */
public class Program6 {
    public static void main(String[] args) {
        roundingCorrect();
        roundingWrong();
    }

    private static void roundingCorrect() {
        System.out.println("Rounding correct with a=0.4 and b=0.6");
        double a = 0.4;
        double b = 0.6;
        double c = a + 0.1;
        double d = b - 0.1;
        System.out.println("0.4+0.1 == 0.6-0.1 : " + (c == d));
        System.out.println("0.5 - 0.5 == " + (c - d));
    }

    private static void roundingWrong() {
        System.out.println("\nRounding wrong with a=0.7 and b=0.9");
        double a = 0.7;
        double b = 0.9;
        double c = a + 0.1;
        double d = b - 0.1;
        System.out.println("0.7+0.1 == 0.9-0.1 : " + (c == d));
        System.out.println("0.8 - 0.8 == " + (c - d));

    }

}
