package com.aashish.app.oops;

import com.aashish.app.String.StringGuide;

/**
 * Lets say there is a class called A, which extends B.
 */
class Parent {
    public double age = 60;

    public double getAge() {
        System.out.println("Parent Age : " + this.age);
        return this.age;
    }
}

class Child extends Parent {

    public String name = "Child";
    public int age = 30;


    @Override
    public double getAge() {
        System.out.println("Child Age : " + this.age);
        return super.getAge() + this.age;
    }

    public String getName() {
        return this.name;
    }
}

class GrandChild extends Child {
    private double age;
    private String name;

    public GrandChild(double age) {
        this.age = age;
    }

    @Override
    public double getAge() {
        System.out.println("Grand Child Age : " + this.age);
        return super.getAge() + this.age;
    }

    @Override
    public String getName() {
        return name;
    }
}

public class MultiLevelInheritance extends StringGuide {

    @Override
    public String getString() {
        return super.getString();
    }

    public static void main(String[] args) {
        MultiLevelInheritance M = new MultiLevelInheritance();
        M.init();
    }

    public void init() {
        GrandChild gr = new GrandChild(Integer.parseInt(this.getString(), 10));
        Parent pr = new Parent();

        System.out.println("Total  Family Age : " + gr.getAge());

    }

}

