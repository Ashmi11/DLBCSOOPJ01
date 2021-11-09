package session1;

import java.util.Scanner;

/**
 * Write a program that prompts the user to enter two numbers and then calculates
 * addition, subtraction, multiplication and division of both those numbers.
 */
public class Task3 {
    public static void main(String[] args) {
        Scanner scan = new java.util.Scanner(System.in);
        System.out.print("Please enter the first number: ");
        double a = scan.nextDouble();

        System.out.print("\nPlease enter the second number: ");
        double b = scan.nextDouble();

        System.out.println("\nAddition: " + a + " + " + b + " == " + (a + b));
        System.out.println("Subtraction: " + a + " - " + b + " == " + (a - b));
        System.out.println("Multiplication: " + a + " * " + b + " == " + (a * b));
        System.out.println("Division: " + a + " / " + b + " == " + (a / b));
    }
}
