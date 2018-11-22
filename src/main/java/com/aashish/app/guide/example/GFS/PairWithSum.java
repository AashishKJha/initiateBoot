package com.aashish.app.guide.example.GFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class PairWithSum {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //no of test cases
        int tc = Integer.parseInt(br.readLine());
        //inputs of test cases
        for (int i = 0; i < tc; i++) {
            int size = Integer.parseInt(br.readLine());
            ArrayList<Integer> arr = new ArrayList<>();
            ArrayList<String> arrF = new ArrayList<>();
            ArrayList<String> str = new ArrayList<>(Arrays.asList(br.readLine().trim().split(" ")));
            /* elements ao array */
            str.forEach(d -> {
                arr.add(Integer.parseInt(d));
            });
            int sum = Integer.parseInt(br.readLine());
            process(arr, arrF, sum);
        }

    }

    private static boolean calc(int el1, int el2, int sum) {
        return el1 + el2 == sum;
    }

    private static void process(ArrayList<Integer> arr, ArrayList<String> arrF, int sum) {
        int count = 0;
        for (int p = 0; p < arr.size(); p++) {
            for (Integer anArr : arr) {
                if (calc(arr.get(p), anArr, sum) && (arrF.indexOf(anArr.toString() + arr.get(p).toString()) < 0) && (arr.get(p) != anArr)) {
                    arrF.add(arr.get(p).toString() + anArr.toString());
                    System.out.println(arr.get(p) + " " + anArr + " " + sum);
                    count++;
                }
            }
        }

        if (count == 0) {
            System.out.println(-1);
        }
    }
}

