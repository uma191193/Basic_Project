package org.basic;

public class MyRunnable implements Runnable {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Child thread");
        }
    }
    /*String x, y;
    public void run()
    {
        for(int i = 0; i < 10; i++)
            synchronized(this)
            {
                x = "Hello";
                y = "Java";
                System.out.print(x + " " + y + " ");
            }
    }*/

}
