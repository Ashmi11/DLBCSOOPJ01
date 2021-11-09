package session2;

/**
 * Use for, while and do-while to implement a loop that counts down from 100 to 50 in steps of 5.
 */
public class Task3 {
    public static void main(String[] args) {
        System.out.println("for loop");
        for (int i = 100; i >= 50; i -= 5) {
            System.out.print(i + "\t");
        }

        System.out.println("\n\nwhile loop");
        int i = 100;
        while (i >= 50) {
            System.out.print(i + "\t");
            i -= 5;
        }
        System.out.println("\n\ndo-while loop");
        i = 100;
        do {
            System.out.print(i + "\t");
            i -= 5;
        } while (i >= 50);
    }
}
