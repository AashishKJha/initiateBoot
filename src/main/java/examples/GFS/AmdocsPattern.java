package examples.GFS;


public class AmdocsPattern {
    public static void main(String[] args) {
        int rows = 4;
        int col = 4;
        int data = 1;
        int[][] arr = new int[rows][col];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < col; j++) {
                if (i < col - j - 1) {
                    arr[i][j] = 0;
                } else {
                    int temp = arr[i][j];
                    if (temp > data) {
                        arr[i][j] = temp;
                    } else {
                        arr[i][j] = data;
                    }
                    data++;
                }
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < col; j++) {
                if (arr[i][j] == 0)
                    System.out.print(" ");
                else
                    System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
}

