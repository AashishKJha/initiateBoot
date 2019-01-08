package examples.DataStructures.arrays.common;

public class CreateArray {
    public int[] getArr(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = i;
        }
        return arr;
    }
}
