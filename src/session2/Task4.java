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
        Scanner scan = new java.util.Scanner(System.in);
        System.out.print("\nPlease enter a positive number: ");
        String input = scan.nextLine();

        String output = "";

        char[] characters = input.toCharArray();
        for (int i = 0; i < characters.length; i++) {
            char currentChar = characters[i];
            switch (currentChar) {
                case '0':
                    output += "zero ";
                    break;
                case '1':
                    output += "one ";
                    break;
                case '2':
                    output += "two ";
                    break;
                case '3':
                    output += "three ";
                    break;
                case '4':
                    output += "four ";
                    break;
                case '5':
                    output += "five ";
                    break;
                case '6':
                    output += "six ";
                    break;
                case '7':
                    output += "seven ";
                    break;
                case '8':
                    output += "eight ";
                    break;
                case '9':
                    output += "nine ";
                    break;
            }
        }
        System.out.println(output);

    }
}
