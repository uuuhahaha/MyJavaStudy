package com.zdg.day04.demo02;

/*
* 同步代码块，保证线程安全
* */

public class RunnableDemo02 implements Runnable {
    private int ticket = 100;

    Object object = new Object();

    @Override
    public void run() {
        while (true) {
            synchronized (object) {
                if (ticket > 0) {
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("出售票" + ticket + "-->剩余" + ticket + "张");
                    ticket--;
                } else {
                    break;
                }
            }
        }
    }
}
