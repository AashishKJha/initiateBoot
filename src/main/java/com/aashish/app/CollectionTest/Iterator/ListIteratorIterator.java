package com.aashish.app.CollectionTest.Iterator;

import java.util.Collection;
import java.util.LinkedList;
import java.util.ListIterator;

/**
 * its type of Iterators.
 * <p>
 * It is only applicable for List collection implemented classes like arraylist, linkedlist etc.
 * It provides bi-directional iteration.
 */
public class ListIteratorIterator {
    public static void main(String[] args) {
        LinkedList li = new LinkedList();
        for (int i = 0; i < 10; i++) {
            li.addFirst(i + 1);
            li.addLast(i + 1);
        }

        ListIterator liE = li.listIterator();

        while (liE.hasNext()) {
            System.out.println(liE.next());
        }
    }

}
