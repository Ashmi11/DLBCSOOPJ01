package session1;

import java.util.Scanner;

/**
 * Write a program that prompts the user for a temperature in degree Celsius and displays
 * the equivalent temperature in degree Fahrenheit.
 *
 * Hint:
 * 0 degree Celsius corresponds to 273,15 Kelvin
 * degree_celsius = 5 / 9 * (degree_fahrenheit − 32)
 */
public class Task4 {
    public static void main(String[] args) {
        Scanner scan = new java.util.Scanner(System.in);
        System.out.print("Please enter the temperature in ° Celsius: ");
        double celsius = scan.nextDouble();

        double fahrenheit = celsius * 9 / 5 + 32;
        System.out.println(celsius + "°C is " + fahrenheit + "°F");


    }
}
