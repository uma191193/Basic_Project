package org.basic.model;

public class MyThread extends Thread {

    public void run(int input) {
        for (int i = 0; i < 5; i++) {
            System.out.println("Arg Thread name is " + Thread.currentThread().getName());
        }
    }

    /*class MyThread extends Thread {
        public static void main(String[] args) {
            MyThread t = new MyThread();
            t.run();
        }

        public void run() {
            for (int i = 1; i < 3; ++i) {
                System.out.print(i + "..");
            }
        }
    }*/

    /*MyThread() {
        System.out.print(" MyThread");
    }

    public void run() {
        System.out.print(" bar");
    }

    public void run(String s) {
        System.out.println(" baz");
    }*/

    //static Thread mt;
    /*public void run() {
        for (int i = 0; i < 5; i++) {
            Thread.currentThread().setName("Child");
            System.out.println("No-arg Thread name is " + Thread.currentThread().getName());
        }
    }*/

    /*public void run() {
        for (int i = 0; i < 5; i++) {
            Thread.currentThread().setName("Child");
            System.out.println("No-arg Thread name is " + Thread.currentThread().getName());
        }
        try {
            mt.join(6000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        for (int i = 0; i < 5; i++) {
            Thread.currentThread().setName("Child");
            System.out.println("No-arg Thread name is " + Thread.currentThread().getName());
        }
    }*/
}

