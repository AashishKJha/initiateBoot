package com.aashish.app.oops;

import com.aashish.app.String.StringGuide;

/**
 * Demostration of claases an object.
 * <p>
 * <p>
 * A class is a user defined blueprint or prototype from which objects are created.
 * <p>
 * Class is set of properties and methods.
 */

public class ClassesAndObjects {

    //member variables

    public String name;

    private double age;

    protected int mobileNumber;


    //This class will have default constructor.

    //no-arg Contractor.

    protected ClassesAndObjects() {

    }

    //member functions

    public String getName() {
        return this.name;
    }

    public void setName(String name) {

        this.name = name;

    }

    //
    @Override
    public String toString() {
        return (this.getName());
    }
}


class Main {
    public static void main(String[] args) {

        /**
         * Way to create Constructor In Java.
         */

        ClassesAndObjects m = new ClassesAndObjects();

        m.setName("Aaahish Kumar Jha");

        System.out.println(m.toString());
    }
}


class SwapInstance {

    public static void main(String[] args) {
        ClassesAndObjects c1 = new ClassesAndObjects();
        ClassesAndObjects c2 = new ClassesAndObjects();
        SwapInstance s = new SwapInstance();
        System.out.println("________________Before Swapping of Instances_________________");
        c1.setName("aashish1");
        System.out.println(c1.getName());
        c2.setName("aashish2");
        System.out.println(c2.getName());
        Swap(c1, c2);
        System.out.println("________________After Swapping of Instances_________________");
        System.out.println(c1.getName());
        System.out.println(c2.getName());
    }

    public static void Swap(ClassesAndObjects c1, ClassesAndObjects c2) {
        ClassesAndObjects temp;
        temp = c1;
        c1 = c2;
        c2 = temp;

        //Swapped Instances.
        System.out.println(c1.getName());
        System.out.println(c2.getName());
    }
}
