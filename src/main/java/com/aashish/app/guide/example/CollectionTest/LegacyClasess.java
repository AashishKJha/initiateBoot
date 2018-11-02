package com.aashish.app.guide.example.CollectionTest;

import java.util.Hashtable;
import java.util.Vector;

/**
 * Array, Vector and hashtable are lagecy classes
 */
public class LegacyClasess {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<String>();
        int[] arr = new int[10];
        Hashtable<Integer, String> hs = new Hashtable<>();

        for (int i = 0; i < 10; i++) {
            vector.addElement(String.valueOf(i));
            arr[i] = i;
            hs.put(i, String.valueOf(i));
        }

        System.out.println("Printing vectors");
        System.out.println(vector);
        System.out.println("Printing Arrays");
        for (int i : arr) {
            System.out.print(arr[i]);
        }
        System.out.println("Printing hashtable");
        System.out.println(hs);
    }

}
