package com.aashish.app.guide.example;

import java.util.Scanner;

public class Operator {
    Scanner input;

    Operator() {
        this.input = new Scanner(System.in);
    }

    protected String getString() {
        System.out.print("Enter String >> ");
        return this.input.nextLine();
    }

    protected int getBoolean() {
        System.out.print("Enter Integer >> ");
        return this.input.nextInt();
    }

    protected char getChar() {
        System.out.print("Enter Character >> ");
        return this.input.next().charAt(0);
    }


}

class Arithmetic {
    public int add(char[] a) {
        int temp = 0;

        // Using Var args for taking infinite input.
        for (char data : a) {
            temp = temp + Integer.parseInt(String.valueOf(data));
        }

        return temp;
    }

    public int sub(int a, int b) {
        return a - b;
    }

    public int mul(char[] a) {
        int temp = 1;

        // Using Var args for taking infinite input.
        for (char data : a) {
            temp = temp * Integer.parseInt(String.valueOf(data));
        }

        return temp;
    }

    public double div(double a, double b) {
        return a / b;
    }

    public double mod(double a, double b) {
        return a % b;
    }
}

class Logical {

}

class Driver {
    public static void main(String[] args) {
        Arithmetic ar = new Arithmetic();
        Operator op = new Operator();
        System.out.println("Output Arithmatic addition : " + ar.mul(op.getString().toCharArray()));
        System.out.println("Output Arithmatic multiplication : " + ar.mul(op.getString().toCharArray()));
        System.out.println("Output Arithmatic substraction : " + ar.sub(op.getBoolean(), op.getBoolean()));
        System.out.println("Output Arithmatic division : " + ar.div(op.getBoolean(), op.getBoolean()));
        System.out.println("Output Arithmatic modulo : " + ar.mod(op.getBoolean(), op.getBoolean()));
    }
}




