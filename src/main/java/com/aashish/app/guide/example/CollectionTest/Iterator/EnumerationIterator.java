package com.aashish.app.guide.example.CollectionTest.Iterator;

import java.util.Enumeration;
import java.util.Vector;

/**
 * Its a type of Iterator:
 * <p>
 * <p>
 * Enumaration is interface that is used to get elements of legacy Collection (Vector, hastable).
 * <p>
 * First Iterator (from 1.0) rest are included after 1.2.
 * <p>
 * <p>
 * There are two methods is Enumration Interface namely as :
 * <p>
 * 1. public boolean hasMoreElements(); - test if enumaration contains more element.
 * <p>
 * 2. public Object nextElement();- return next element. if element not present that EXception : NoSuchElementException
 */

public class EnumerationIterator {
    public static void main(String[] args) {
        Vector vectr = new Vector();
        for (int i = 0; i < 10; i++) {
            vectr.addElement(i);
        }
        Enumeration e = vectr.elements();
        while (e.hasMoreElements()) {
            System.out.println("Element : " + e.nextElement());
        }
    }
}
