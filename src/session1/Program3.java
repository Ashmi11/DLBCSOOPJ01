package session1;

/**
 * This program demonstrates the overflow of Integer
 * i.e. an int variable can only contain a certain size
 */
public class Program3 {
    public static void main(String[] args) {
        int i = 1000000;
        i = i * i;
        System.out.println("Result is " + i);
    }

}
