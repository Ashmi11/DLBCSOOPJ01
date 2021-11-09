package session3;

import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Write a program that allows users to bet in a lottery game (6 of 49).
 * The program should then randomly draw numbers and count how many draws were required to get a 6er.
 */
public class Task2 {
    public static void main(String[] args) {
        int[] betNumbers = new int[6];
        Scanner scan = new Scanner(System.in);


        // get 6 numbers from the user
        // write your code from here
        for (int i = 0; i < betNumbers.length; i++) {
            betNumbers[i] = scanNumber(betNumbers, scan);
        }
        // until here ----------------

        Arrays.sort(betNumbers);
        int nrOfDraws = 0;
        int[] drawnNumbers;

        System.out.println("Calculating...");
        // repeat as long as betNumbers and drawnNumbers are not the same
        do {
            // generate random numbers
            nrOfDraws++;
            drawnNumbers = generateRandomNumbers();
        }
        // write your condition here, using "Arrays.equals()"
        while (Arrays.equals(betNumbers, drawnNumbers) == false);

        System.out.println("drawnNumbers = " + Arrays.toString(drawnNumbers));
        System.out.println("Nr of draws necessary = " + String.format("%,d", nrOfDraws));
    }

    /**
     * Repeats scanning a number until it is valid
     * @param numbers as int[] - number array to fill
     * @param scan as Scanner - scanner passed by main method
     * @return newNumber as int - a valid number
     */
    private static int scanNumber(int[] numbers, Scanner scan) {
        int newNumber;
        boolean isNumberValid;
        do {
            System.out.print("Please enter a bet number between 1 and 49: ");
            newNumber = scan.nextInt();
            isNumberValid = checkNumber(numbers, newNumber);
        } while (isNumberValid == false);
        return newNumber;
    }

    /**
     * Checks if the new number is between 1 and 49
     * Checks if the new number already exists in the numbers array
     * @param numbers as int[] - number array to fill
     * @param newNumber as int - a new number to check
     * @return isValidNumber as boolean - true if the number passed the checks
     */
    private static boolean checkNumber(int[] numbers, int newNumber) {
        if (newNumber < 1 || newNumber > 49) {
            System.out.println("Only numbers between 1 and 49!");
            return false;
        }
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == newNumber) {
                System.out.println("This number already exists!");
                return false;
            }
        }
        return true;
    }

    /**
     * Generates 6 random, unique numbers between 1 and 49
     *
     * @return randomNumber as int[]
     */
    private static int[] generateRandomNumbers() {
        return ThreadLocalRandom
                .current()
                .ints(1, 49)
                .limit(6)
                .distinct()
                .sorted()
                .toArray();
    }

}
