package org.basic.model;

import java.util.Comparator;

public class MyComparator implements Comparator<Integer> {
    public int compare(Integer obj1, Integer obj2) {
        if (obj1 > obj2) {
            return 1;
        } else if (obj1 < obj2) {
            return -1;
        } else {
            return 0;
        }
        //System.out.println("Thread group is : "+Thread.currentThread().getThreadGroup().getName());
        /*MyRunnable r = new MyRunnable();
        Thread t1 = new Thread(r);
        Thread t2 = new Thread(r);
        t1.start();
        t2.start();*/
        /*System.out.print("1 ");
        synchronized (args) {
            System.out.print("2 ");
            try {
                args.wait(); *//* Line 11 *//*
            } catch (InterruptedException e) {
            }
        }
        System.out.print("3 ");*/
    }
    /*public static void main(String[] args) {
        Thread t = new MyThread() {
            public void run() {
                System.out.println(" foo");
            }
        };
        t.start();
    }*/

    /*public void m1(){
        for (int i = 0; i < 10; i++) {
            System.out.println("Instance - " + i);
        }
    }

    public static void m2(){
        for (int i = 0; i < 10; i++) {
            System.out.println("Static - " + i);
        }
    }*/
    //public static void main(String[] args) throws InterruptedException {

        /*for (int i = 0; i < 5; i++) {
            System.out.println("Thread name is " + Thread.currentThread().getName() + " - " + i);
            Thread.sleep(1000);
        }*/


        /*MyThread.mt = Thread.currentThread();
        MyThread thread = new MyThread();
        //thread.setPriority(10);
        thread.start();
        for (int i = 0; i < 5; i++) {
            Thread.sleep(2000);
            Thread.currentThread().setName("main");
            System.out.println("Thread is " + Thread.currentThread().getName());
        }*/

        /*LocalDate localDate = LocalDate.now();
        LocalTime localTime = LocalTime.now();
        LocalDateTime localDateTime = LocalDateTime.now();

        System.out.println("Date is : " + localDate + " Time is : " + localTime + " DateNTime is : " + localDateTime);
        System.out.println(localDate.getYear());
        System.out.println(localDate.getMonth());
        System.out.println(localDate.getDayOfMonth());
        System.out.println(localDate.getDayOfWeek());
        System.out.println(localDate.getDayOfYear());
        System.out.println(localDate.getYear());
        System.out.println(localDate.getMonth());
        System.out.println(localDate.getDayOfMonth());
        System.out.println(localDate.getDayOfWeek());
        System.out.println(localDate.getChronology());
        System.out.println(localDate.getYear());
        System.out.println(localDate.getMonth());
        System.out.println(localDate.getDayOfMonth());
        System.out.println(localDate.getDayOfWeek());
        System.out.println(localDate.getEra());
        System.out.println(localDate.getYear());
        System.out.println(localDate.getMonth());
        System.out.println(localDate.getDayOfMonth());
        System.out.println(localDate.getDayOfWeek());
        System.out.println(localTime.getNano());
        System.out.println(localTime.getSecond());
        System.out.println(localTime.getMinute());
        System.out.println(localTime.getHour());
        System.out.println(localTime.plusHours(2));*/
        /*Runnable r = () -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("Anonymous thread - " + i);
            }
        };*/
        /*Runnable rs = new MyRunnable() {
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("Anonymous thread - " + i);
                }
            }
        };*/
    //Runnable rs = new MyRunnable();
        /*Main m = new Main();
        Runnable r = m::m1;*/
        /*Runnable r = Main::m2;
        Thread t = new Thread(r);
        t.start();
        for (int i = 0; i < 10; i++) {
            System.out.println("Main - " + i);
        }*/
        /*BiPredicate<Integer, Integer> biPredicate = (a, b) -> ((a + b) % 2) == 0;
        System.out.println(biPredicate.test(2,3));*/

        /*List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(15);
        list.add(5);
        System.out.println("Before sorting " + list);
        list.sort(new MyComparator());
        *//*list.sort((a, b) -> {
            if (a > b) {
                return 1;
            } else if (a < b) {
                return -1;
            } else {
                return 0;
            }
        });*//*
        //list.sort(Integer::compareTo);
        //Collections.sort(list, new MyComparator());
        //list.sort((a,b)->a.compareTo(b));
        System.out.println("After sorting " + list);*/
    //}
}

