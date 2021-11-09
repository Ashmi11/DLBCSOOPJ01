package session2;

import java.util.Scanner;

/**
 * Implement a program that takes a positive integer as input and then writes out its digits as text
 * (e.g. 3571 creates the output “three five seven one“).
 * Use a while-loop and a switch-branch.
 * Create a structogram before implementing the algorithm.
 */
public class Task4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("\nPlease enter a positive number: ");
        String input = scan.nextLine();
        String output = "";

        char[] characters = input.toCharArray();

        // write your code here...

        System.out.println(output);

    }
}
