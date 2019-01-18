package examples.DataStructures.arrays.other;

import java.util.Arrays;
import java.util.HashSet;

public class RearrangeAofIequaltoI {
    public static void main(String[] args) {
        int[] arr = {-1, -1, 6, 1, 9, 3, 2, -1, 4, -1};
        arrangeArr(arr);
        arrangeUsingHashSet(arr);
    }

    //TC : O(n*n)
    private static void arrangeArr(int[] arr) {

        //TC : O(n*n)
        for (int loc = 0; loc < arr.length; loc++) {
            for (int data = 0; data < arr.length; data++) {
                if (loc == arr[data]) {

                    //swapping code
                    int temp = arr[loc];
                    arr[loc] = arr[data];
                    arr[data] = temp;
                    break;
                }
            }
        }

//        for(int d: arr){
//            System.out.print(d);
//        }
        System.out.println(Arrays.toString(arr));
    }

    //TC : O(nlogn)
    private static void arrangeUsingHashSet(int[] arr) {
        HashSet<Integer> hs = new HashSet<>();

        //TC: O(n)
        for (int d : arr) {
            hs.add(d);
        }
        int i = 0;

        //TC : O(n)
        for (int data : arr) {

            //O(logn)
            if (hs.contains(i)) {
                arr[i] = i;
            }
            i++;
        }

        System.out.println(Arrays.toString(arr));
    }
}
