package examples.DataStructures.arrays.basicop;

import java.util.Arrays;

public class AlternativeSorting {
    static int[] arr = {7, 1, 2, 3, 4, 5, 6};

    static final int SHIFTLOCATION = 2;

    public static void main(String[] args) {
        int min, max;
        Arrays.sort(arr);// O(nlogn)
        min = arr[0];
        max = arr[arr.length - 1];
        System.out.println(min);
        System.out.println(max);

        //Reverse Of Array
        AlternativeSorting.reverse(arr);

    }

    private static void reverse(int[] orgArr) {
        int temp, arr[] = new int[orgArr.length];
        for (int anOrgArr : orgArr) {
            System.out.print(anOrgArr);
        }
        for (int i = 0; i < orgArr.length; i++) {
            temp = orgArr[orgArr.length - (i + 1)];
            orgArr[orgArr.length - (i + 1)] = orgArr[i];
            orgArr[i] = temp;
        }
        for (int anOrgArr : orgArr) {
            System.out.print(anOrgArr);
        }
    }
}
