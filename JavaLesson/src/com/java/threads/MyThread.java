package com.java.threads;

public class MyThread implements Runnable{
    private String name;
    public MyThread(String name) {
        this.name = name;
    }
public void run () {
    System.out.println("this thread " +name+ " is running");
}

    public static void main(String[] args) {
        Thread t1 = new Thread(new MyThread("Thread1"));
        Thread t2 = new Thread(new MyThread("Thread2"));
        Thread t3 = new Thread(new MyThread("Thread3"));

        t1.start();
        t2.start();
        t3.start();
    }
}