package com.aashish.app;

import jdk.nashorn.internal.runtime.Debug;

public class Contructors {

    public static void main(String[] args) {
        TestConstructors ts = new TestConstructors();
        System.out.println("For Constructor TestConstructors()");
        System.out.println("_________________________________________________________");
        ts.setName("aashish");
        System.out.println("name : " + ts.getName());
        System.out.println("Max : " + ts.MAX);


        TestConstructors tsd = new TestConstructors();
        tsd.setName("aashish sasas");
        System.out.println("For Constructor TestConstructors()");
        System.out.println("_________________________________________________________");
        System.out.println("name : " + tsd.getName());
        System.out.println("Max : " + tsd.MAX);


        TestConstructors ts1 = new TestConstructors("Jha");
        System.out.println("For Constructor TestConstructors(aashish)");
        System.out.println("_________________________________________________________");
        System.out.println("name : " + ts1.getName());
        ts1.setName("aashish jha");
        System.out.println("name : " + ts1.getName());
        System.out.println("Max : " + ts1.MAX);


    }
}


class TestConstructors {

    static final int MAX;

    static {
        MAX = 10;
    }

    protected String name;

    /**
     * No Argument Constructor.
     */
    TestConstructors() {
    }

    /**
     * Augmented constructor with on parameter.
     *
     * @param name - parameter of type String.
     */
    TestConstructors(String name) {
        this.name = name;
    }


    public int getMax() {
        return MAX;
    }


    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}