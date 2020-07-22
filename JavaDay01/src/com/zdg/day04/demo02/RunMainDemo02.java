package com.zdg.day04.demo02;

public class RunMainDemo02 {
    public static void main(String[] args) {
        RunnableDemo02 runnableDemo02 = new RunnableDemo02();

        Thread thread1 = new Thread(runnableDemo02);
        Thread thread2 = new Thread(runnableDemo02);
        Thread thread3 = new Thread(runnableDemo02);

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
