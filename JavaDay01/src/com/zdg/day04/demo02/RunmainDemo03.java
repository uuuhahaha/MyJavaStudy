package com.zdg.day04.demo02;

public class RunmainDemo03{

    public static void main(String[] args) {
        RunnableDemo02 runnableDemo03 = new RunnableDemo02();

        Thread thread1 = new Thread(runnableDemo03);
        Thread thread2 = new Thread(runnableDemo03);
        Thread thread3 = new Thread(runnableDemo03);

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
