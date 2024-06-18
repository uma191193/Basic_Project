package org.basic.model;

public class MyPracticeThread implements Runnable {

    static int counter = 1;
    Object object;

    public MyPracticeThread(Object object) {
        this.object = object;
    }

    @Override
    public void run() {
        while (counter <= 10) {
            if (counter % 2 == 0 && Thread.currentThread().getName().equals("EVEN")) {
                synchronized (object) {
                    System.out.println("Thread name is : " + Thread.currentThread().getName() + " and number is : " + counter);
                    counter++;
                    try {
                        object.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }

            }
            if (counter % 2 != 0 && Thread.currentThread().getName().equals("ODD")) {
                synchronized (object) {
                    System.out.println("Thread name is : " + Thread.currentThread().getName() + " and number is : " + counter);
                    counter++;
                    object.notify();
                }
            }
        }
    }
}
