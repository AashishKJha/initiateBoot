package examples.DataStructures.arrays.basicop;

public class AlternativeSorting {
    int[] arr = {7, 1, 2, 3, 4, 5, 6};

    public static void main(String[] args) {

    }

    int[] sort() {
        int temp;
        int fmax, fmin;
        //Using Bubble sort for sorting.
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] >= arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }

            }
        }

        System.out.println(arr);

        fmax = arr[0];

        fmin = arr[arr.length - 1];


        //changeing locations


        return arr;
    }

}
