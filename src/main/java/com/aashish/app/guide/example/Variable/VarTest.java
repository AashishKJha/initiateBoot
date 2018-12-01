package com.aashish.app.guide.example.Variable;

public class VarTest {
    //instance or non-static variable
    //default access modifier
    String name;
    private int age = 0;
    protected String fName;
    public String surName;

    //static variables;
    public static String standard;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        //local variable scope outside setName().
        String surName = " Jha";
        this.name = name + surName;
    }

    public static void main(String[] args) {

        VarTest.standard = "12";

        VarTest vr = new VarTest();
        vr.setName("aashish");
        System.out.println("Name1 : " + vr.getName());
        System.out.println("Standard : " + VarTest.standard);

        VarTest.standard = "13";

        VarTest vr1 = new VarTest();
        vr1.setName("Ram Chandra");
        System.out.println("Name2 : " + vr1.getName());
        System.out.println("Standard : " + VarTest.standard);

    }
}
