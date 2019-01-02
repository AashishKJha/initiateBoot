package examples.GFS;

import java.util.ArrayList;
import java.util.Scanner;

public class FindUnique {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        for (int i = 0; i < tc; i++) {
            ArrayList<Integer> arr = new ArrayList<>();
            int size = sc.nextInt();
            for (int j = 0; j < size; j++) {
                int el = sc.nextInt();
                arr.add(el);
            }

            //Binary Search is prefered
            for (int p = 0; p < arr.size(); p++) {
                if (arr.lastIndexOf(arr.get(p)) % 2 != 0) {
                    System.out.println(arr.get(p));
                    break;
                }
            }
        }
    }
}
