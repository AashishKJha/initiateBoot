package examples.GFS.array_logics;

import java.util.Arrays;
import java.util.Scanner;

public class MaxMinForm {

    /**
     * Method is responsible to initially invoked by JVM.
     *
     * @param args- terminal arguments.
     */
    public static void main(String[] args) {
        String userInput = getUserInput();

        int[] itnArr = new int[userInput.length()];

        for (int i = 0; i < userInput.length(); i++) {
            itnArr[i] = Character.getNumericValue(userInput.charAt(i));
        }

        Arrays.sort(itnArr);

        System.out.println("Before Process Array");

        print(itnArr);

        generateOutput(itnArr);

    }

    /**
     * Method is responsible to return user input.
     *
     * @return - user input as string.
     */
    private static String getUserInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Array Data : ");
        return scanner.next();
    }

    /**
     * @param sortedArray
     */
    private static void generateOutput(int[] sortedArray) {
        int Length = sortedArray.length;
        int[] newArray = new int[Length];
        for (int i = 0, j = Length - 1; i < Length; i = i + 2, j--) {
            newArray[i] = sortedArray[j];
            if (i + 1 < Length) {
                newArray[i + 1] = sortedArray[i / 2];
            }
        }
        System.out.println("After Process Array");
        print(newArray);
    }

    private static void print(int[] arr) {
        for (int a : arr) {
            System.out.print(a + ",");
        }
        System.out.println();
    }


}
