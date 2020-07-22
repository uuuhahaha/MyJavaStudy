package com.zdg.day04.demo03;

/*
* 包子铺，负责生产包子
* */

public class Baozipu implements Runnable {
    private Baozi bz;
    private int count = 0;

    public Baozipu(Baozi bz) {
        this.bz = bz;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (bz) {
                if (bz.isFlag() == true) {
                    try {
                        bz.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } else {
                    if (count % 2 == 0) {
                        bz.setPi("小笼包");
                        bz.setXian("肉馅");
                    } else {
                        bz.setPi("大包子");
                        bz.setXian("素馅");
                    }
                    System.out.println("正在生产" + bz.getXian() + "的" + bz.getPi());
                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    bz.setFlag(true);
                    count++;
                    System.out.println("包子生产完成，可以吃了");
                    bz.notify();
                }
            }
        }
    }
}
