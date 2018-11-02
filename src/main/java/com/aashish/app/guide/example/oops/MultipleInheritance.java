package com.aashish.app.guide.example.oops;

/**
 * We can perform multiple inheritance in java.
 */

public class MultipleInheritance implements Tets1, Test2 {


    public static void main(String[] args) {
        MultipleInheritance ml = new MultipleInheritance();
        System.out.println("Name : " + ml.getName("Aashish") + " Age : " + ml.getAge(12));
    }

    @Override
    public String getName(String name) {
        return name;
    }

    @Override
    public double getAge(double age) {
        return age;
    }
}

interface Tets1 {
    String getName(String name);

}

interface Test2 {
    double getAge(double Age);
}

