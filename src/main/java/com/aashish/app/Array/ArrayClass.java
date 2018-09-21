package com.aashish.app.Array;

import java.util.Scanner;

public class ArrayClass {
    char[] arr = new char[10];

    /**
     * driver method
     */
    public static void main(String[] args) {
        ArrayClass ac = new ArrayClass();
        int i = 0;
        while (i < ac.arr.length) {
            ac.arr[i] = ac.getChar();
            i++;
        }
        System.out.println(ac.arr);
    }

    public Scanner retScannerObject() {
        Scanner in = new Scanner(System.in);
        return in;
    }

    public char getChar() {
        System.out.print("Enter  Character: ");
        return this.retScannerObject().next().charAt(0);
    }
}
