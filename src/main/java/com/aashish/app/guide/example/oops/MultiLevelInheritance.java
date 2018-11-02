package com.aashish.app.guide.example.oops;

import com.aashish.app.guide.example.String.StringGuide;

/**
 * Lets say there is a class called A, which extends B.
 */
class Parent {

    public double age = 60;

    public double getAge() {
        System.out.println("Parent Age : " + this.age);
        return this.age;
    }

    public Parent() {
        System.out.println("In parent const");
    }
}

class Child extends Parent {

    public String name;
    public double age;

    public Child() {
        System.out.println("In child const");
    }

    Child(String name, double age) {
        this.name = name;
        this.age = age;
    }

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
//    Child ch = new Child("Child", 30);

    public GrandChild() {

        System.out.println("Ing rand child");

    }

    public GrandChild(double age) {
        super("s", 1);
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

        GrandChild gd = new GrandChild();
    }

    public void init() {
        GrandChild gr = new GrandChild(Integer.parseInt(this.getString(), 10));
        Parent pr = new Parent();

        System.out.println("Total  Family Age : " + gr.getAge());

    }

}

