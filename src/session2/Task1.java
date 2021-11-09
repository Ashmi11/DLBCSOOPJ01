package session2;

import java.util.Scanner;

/**
 * A year is a leap year, if it can be divided by 4.
 * It is not a leap year, if it can be divided by 100.
 * It is a leap year again, if it can be divided by 400.
 * Create a graphical representation of the algorithm (e.g. using a structogram in Nassi–Shneiderman notation).
 * Implement the algorithm in Java.
 */
public class Task1 {
    public static void main(String[] args) {
        Scanner scan = new java.util.Scanner(System.in);
        while (true) {
            System.out.print("\nPlease enter a year: ");
            int year = scan.nextInt();

            boolean isLeapYear = false;

            if (year % 4 == 0) {
                isLeapYear = true;
                if (year % 100 == 0) {
                    isLeapYear = false;
                }
                if (year % 400 == 0) {
                    isLeapYear = true;
                }
            }
            System.out.println("Is year " + year + " a leap year? " +isLeapYear);
        }
    }
}
