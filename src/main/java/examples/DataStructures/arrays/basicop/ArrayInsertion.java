package examples.DataStructures.arrays.basicop;

import examples.DataStructures.arrays.common.CreateArray;

public class ArrayInsertion extends CreateArray {
    public static void main(String[] args) {
        ArrayInsertion arrayInsertion = new ArrayInsertion();
        int[] arr = arrayInsertion.getArr(30);
        for (int a : arr) {
            System.out.print(a);
        }
    }

    @Override
    public int[] getArr(int size) {
        return super.getArr(size);
    }
}
