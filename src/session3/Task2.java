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

        // until here ----------------

        Arrays.sort(betNumbers);
        int nrOfDraws = 0;
        int[] drawnNumbers;

        // repeat until betNumbers and drawnNumbers are not the same
        do {
            // generate random numbers
            nrOfDraws++;
            drawnNumbers  = generateRandomNumbers();
        }
        // write your condition here, using "Arrays.equals()"
        while(false);

        System.out.println("drawnNumbers = " + Arrays.toString(drawnNumbers));
        System.out.println("Nr of draws necessary = " + String.format("%,d", nrOfDraws));


    }

    /**
     * Generates 6 random, unique numbers between 1 and 49
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
