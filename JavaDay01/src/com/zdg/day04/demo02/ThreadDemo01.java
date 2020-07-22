package com.zdg.day04.demo02;

public class ThreadDemo01 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("thread" + i);
        }
    }
}
