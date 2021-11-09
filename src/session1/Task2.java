package session1;

/**
 * What are the values of the variables after each command?
 * int a, b;
 * a = 1234;
 * b = 99;
 * int t = a;
 * a = b;
 * b = t;
 */
public class Task2 {
    public static void main(String[] args) {

        int a, b;
        a = 1234;
        System.out.println("a = " + a);

        b = 99;
        System.out.println("b = " + b);

        int t = a;
        System.out.println("t = " + t);

        a = b;
        System.out.println("a = " + a);

        b = t;
        System.out.println("b = " + b);
    }
}
