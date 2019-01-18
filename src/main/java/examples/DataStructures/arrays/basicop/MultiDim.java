package examples.DataStructures.arrays.basicop;

public class MultiDim {
    static final int SIZE = 8;

    public static void main(String[] args) {
        System.out.println("____Multi Demensional Array___");

        int[][] mul = new int[SIZE][SIZE];

        for (int p = 0; p < SIZE; p++) {
            for (int q = 0; q < SIZE; q++) {
                mul[p][q] = p + q;
            }
        }

        for (int[] aMul : mul) {
            for (int q = 0; q < mul.length; q++) {
                System.out.print(aMul[q] + " ");
            }
            System.out.println();
        }
    }
}
