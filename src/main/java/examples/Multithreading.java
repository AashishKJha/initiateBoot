package examples;

public class Multithreading {
    public static void main(String[] args) {

        System.out.println("Testing Multithreading with Thread class");
        for (int i = 0; i < 5; i++) {
            Test ts = new Test();
            ts.start();
            Multithreading.printData();
        }

        System.out.println("Testing Multithreading with Runnable interface");
        for (int i = 0; i < 5; i++) {
            Thread object = new Thread(new TestRunnable());
            object.start();
        }
    }

    private static synchronized void printData() {
        System.out.println("Printing Synchorizing Data");
    }
}

class Test extends Thread {

    public void run() {
        try {
            System.out.println("____Thread Running Using Thread Class___with thread name" + Thread.currentThread().getName() + " and id : " + Thread.currentThread().getId());
        } catch (Exception e) {
            System.out.println("Error : " + e);
        }
    }
}

class TestRunnable implements Runnable {
    @Override
    public void run() {
        try {
            System.out.println("____Thread Running Using Runnable Interface__ with thread name" + Thread.currentThread().getName() + " and id : " + Thread.currentThread().getId());
        } catch (Exception e) {
            System.out.println("Error : " + e);
        }

    }
}


class A extends Thread {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            A a = new A();
            a.start();
        }
        System.out.println(Thread.currentThread().getName());
    }
}
