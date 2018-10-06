package com.aashish.app.CollectionTest.Iterator;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * It is also type of iterators
 * <p>
 * Universal iterator we can apply on any kind of collections.
 * <p>
 * Methods of Iterator:
 * <p>
 * // Returns true if the iteration has more elements
 * public boolean hasNext();
 * <p>
 * // Returns the next element in the iteration
 * // It throws NoSuchElementException if no more
 * // element present
 * public Object next();
 * <p>
 * // Remove the next element in the iteration
 * // This method can be called only once per call
 * // to next()
 * public void remove();
 * <p>
 * <p>
 * must be used whenever we want to enumerate elements in all Collection framework implemented
 * interfaces like Set, List,
 * Queue, Deque and also in all implemented classes of Map interface.
 */

public class Iteratorterator {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();

        for (int i = 0; i < 10; i++) {
            al.add(i);
        }

        Iterator it = al.iterator();

        while (it.hasNext()) {
            System.out.println("Iteration Elements : " + it.next());

        }
    }
}

