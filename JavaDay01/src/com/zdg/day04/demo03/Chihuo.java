package com.zdg.day04.demo03;

/*
* 吃货，负责吃包子
* */

public class Chihuo implements Runnable {
    private Baozi bz;

    public Chihuo(Baozi bz) {
        this.bz = bz;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (bz) {
                if (bz.isFlag() == true) {
                    System.out.println("开始吃包子");
                    bz.setFlag(false);
                    bz.notify();
                    System.out.println("===========================");
                } else {
                    System.out.println("我要吃包子");
                    try {
                        bz.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
