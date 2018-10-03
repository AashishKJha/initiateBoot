package com.aashish.app.oops;

/**
 * Encapsulation stands for data hiding from outside of class.
 * <p>
 * The data or variable of a class can be accessed by member of that class only.
 * <p>
 * Prevention from direct access.
 */

public class Encapsulation {
    public static void main(String[] args) {
        EncapsulationDemo en = new EncapsulationDemo();

        /**
         * Here variable name , age can not accessed by contructor .
         *
         * It can be only accessed by methods of that class.
         */

        en.setName("aashish");
        en.setAge(24);
        System.out.println("Name : " + en.getName() + " " + " Age : " + en.getAge());
    }
}


class EncapsulationDemo {

    //Private declared member variables.
    private String name;

    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
