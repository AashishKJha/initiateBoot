package com.aashish.app.oops;

public class InterfaceTest implements A, B {

    @Override
    public void showA() {
        System.out.println("In Show A");
    }

    @Override
    public void showB() {
        System.out.println("In Show B");
    }

    public static void main(String[] args) {
        InterfaceTest it = new InterfaceTest();

        it.showA();
        it.showB();
    }
}

interface A {
    void showA();
}

interface B {
    void showB();
}
