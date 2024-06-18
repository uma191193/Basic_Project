package org.basic;

import org.basic.model.MyPracticeThread;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Application started");
        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a value for starting : ");
        int from = scanner.nextInt();
        System.out.println("Enter a value for ending : ");
        int to = scanner.nextInt();*/

        Object lock = new Object();

        Runnable oddThread = new MyPracticeThread(lock);
        Runnable evenThread = new MyPracticeThread(lock);


        new Thread(evenThread, "EVEN").start();
        new Thread(oddThread, "ODD").start();
        System.out.println("Application ended");
    }
}