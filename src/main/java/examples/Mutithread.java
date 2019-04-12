package examples;

public class Mutithread extends Thread {
    public static void main(String[] args) {
        //Creaitng Only One thread which is also main thread!

        Thread mainThread = Thread.currentThread();

        System.out.println("Main Thread Name : " + mainThread.getName());
        mainThread.setName("My Main Thread");
        System.out.println("Changes Main Thread Name : " + mainThread.getName());

        for (int k = 0; k < 3; k++) {
            MThread mThread = new MThread();
            mThread.start();
        }
    }
}


class MThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Child Thread Name : " + Thread.currentThread().getName());
            System.out.println("Child Thread Id : " + Thread.currentThread().getId());
        }
    }
}

