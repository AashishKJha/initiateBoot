package com.aashish.app.CollectionTest.Set;

/**
 * set interface is implemented by hashset, TreeSet, LinkedHashSet.
 */


import com.aashish.app.CollectionTest.CollectionCommon;

import java.util.Collection;
import java.util.Set;

/**
 * Implementing se using hasdset class.
 */
public class HashSet<S> extends CollectionCommon {

    @Override
    public <T> Collection getCollectionFromIterable(Iterable<T> it) {
        return super.getCollectionFromIterable(it);
    }

    public static void main(String[] args) {
        HashSet hs = new HashSet();
        Set<String> set = new java.util.HashSet<>();
        Set<String> set2 = new java.util.HashSet<>();

        set.add("A");
        set.add("B");
        set.add("3");
        set.add("B");
        set.add("4");

        set2.add("A");
        set2.add("C");
        set2.add("@");
        set2.add("B");
        set2.add("4");


        Collection cln = hs.getCollectionFromIterable(set);
        Collection cln2 = hs.getCollectionFromIterable(set2);

        //System.out.println("Collection Set : " + cln);

        //cln.forEach(obj-> {
        // System.out.println("Set Elements : "  + obj);
        //});

        System.out.println("Union : " + hs.union(set, set2));


        System.out.println(set);
        System.out.println(set2);

        System.out.println("Intersections : " + hs.interSection(set, set2));

        System.out.println("Difference : " + hs.difference(set, set2));
    }

    public Set interSection(Set set1, Set set2) {
        set1.retainAll(set2);
        return set1;
    }

    public Set union(Set set1, Set set2) {
        set1.addAll(set2);
        return set1;
    }

    public Set difference(Set set1, Set set2) {
        set1.removeAll(set2);
        return set1;
    }
}


