package com.zdg.day04.demo02;

public class ThreadDemo02 extends Thread{
    @Override
    public void run() {
        System.out.println(this.getName());
    }
}
