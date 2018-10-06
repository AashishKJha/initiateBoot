package com.aashish.app.CollectionTest.Iterator;

import com.sun.org.apache.bcel.internal.generic.INSTANCEOF;

import java.util.ArrayList;
import java.util.Collection;

/**
 *
 */

public class IterableTocollections {

    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }

        Collection<Integer> li = new ArrayList();

        for (int a : arr) {
            ((ArrayList<Integer>) li).add(a);
        }

        li.forEach(System.out::println);

    }

}
