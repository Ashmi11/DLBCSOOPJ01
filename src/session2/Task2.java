package session2;

import java.util.Scanner;

/**
 * A program should take an integer input and then create a multiplication table (example input: 5):
 * 	1 · 1 = 1 	1 · 2 = 2 	1 · 3 = 3 	1 · 4 = 4 	1 · 5 = 5
 * 	2 · 1 = 2 	2 · 2 = 4 	2 · 3 = 6 	2 · 4 = 8 	2 · 5 = 10
 * 	...
 * 	5 · 1 = 5 	5 · 2 = 10 	5 · 3 = 15 	5 · 4 = 20 	5 · 5 = 25
 * Create a structogram for the program.
 * Implement the program using the structogram as basis.
 */
public class Task2 {
    public static void main(String[] args) {
        Scanner scan = new java.util.Scanner(System.in);
        System.out.print("Please enter an integer: ");
        int number = scan.nextInt();

        for (int a = 1; a <= number; a++) {
            for (int b = 1; b <= number; b++) {
                System.out.print(a + "*" + b + "=" + (b * a) + "\t");
            }
            System.out.println();
        }
    }
}
