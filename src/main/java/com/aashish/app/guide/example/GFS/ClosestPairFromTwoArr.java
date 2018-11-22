package com.aashish.app.guide.example.GFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ClosestPairFromTwoArr {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        //first input will be test cases

        System.out.println("Enter Number of Test Cases : ");

        int tc = Integer.parseInt(bf.readLine());

        System.out.println("Number Of Test Cases : " + tc);

        for (int t = 0; t < tc; t++) {
            String[] sizes = bf.readLine().trim().split(" ");
            System.out.println("Sizes Of Arrays " + Arrays.toString(sizes));
            String[] arrs1 = bf.readLine().trim().split(" ");
            String[] arrs2 = bf.readLine().trim().split(" ");
            int sum = Integer.parseInt(bf.readLine());

            //finding diff

            //from arrs1

            int diff = sum;
            int closest = 0;

            for (int p = 0; p < arrs1.length; p++) {
                if (Math.abs(diff - p) < diff) {
                    diff = Math.abs(sum - p);
                    closest = Integer.parseInt(arrs1[p]);

                }
            }

            System.out.println("Closet : " + closest);
            System.out.println("diff : " + diff);
        }
    }
}
