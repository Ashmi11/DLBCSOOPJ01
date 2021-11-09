package session3;

/**
 * Write a program that takes an array of integer values as input
 * (e.g. 45, 7, 88, 102, 1, 3, 50) and returns the smallest and the biggest element.
 */
public class Task1 {
    public static void main(String[] args) {
        int[] integerArray = {45, 7, 88, 102, 1, 3, 50};
        int[] result = smallestAndBiggest(integerArray);
        System.out.println("smallest = " + result[0]);
        System.out.println("biggest = " + result[1]);
    }

    private static int[] smallestAndBiggest(int[] values) {
        int smallest = Integer.MIN_VALUE, biggest = Integer.MAX_VALUE;
        // write your code here

        int[] result = {smallest, biggest};
        return result;
    }
}
