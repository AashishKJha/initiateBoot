package com.aashish.app;

public class Multithreading {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            Test ts = new Test();
            ts.start();
        }

        for (int i = 0; i < 5; i++) {
            Thread object = new Thread(new TestRunnable());
            object.start();
        }
    }
}

class Test extends Thread {

    public void run() {
        try {
            System.out.println("____Thread Running Using Thread Class___with thread name" + Thread.currentThread().getName() + "and id : " + Thread.currentThread().getId());
        } catch (Exception e) {
            System.out.println("Error : " + e);
        }
    }
}

class TestRunnable implements Runnable {
    @Override
    public void run() {
        try {
            System.out.println("____Thread Running Using Runnable Interface__ with thread name" + Thread.currentThread().getName() + "and id : " + Thread.currentThread().getId());
        } catch (Exception e) {
            System.out.println("Error : " + e);
        }

    }
}
