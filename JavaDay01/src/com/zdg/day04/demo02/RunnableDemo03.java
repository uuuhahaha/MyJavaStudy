package com.zdg.day04.demo02;

/*
同步方法
* */

public class RunnableDemo03 implements Runnable{
    private int ticket = 100;

    Object object = new Object();

    @Override
    public void run() {
        while (true) {
            if (ticket < 0) {
                break;
            }
            payticket();
        }
    }

    public synchronized void payticket() {
        if (ticket > 0) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("出售票" + ticket + "-->剩余" + ticket + "张");
            ticket--;
        }
    }
}
