package com.zdg.day04.demo02;

public class RunnableDemo01 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println("Runnable" + i);
        }
    }
}
