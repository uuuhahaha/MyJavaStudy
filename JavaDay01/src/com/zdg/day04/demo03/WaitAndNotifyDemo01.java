package com.zdg.day04.demo03;

/*
* 无限等待
* */

public class WaitAndNotifyDemo01 {
    public static void main(String[] args) {
        Object object = new Object();

        new Thread() {
            @Override
            public void run() {
                synchronized (object) {
                    System.out.println("我要吃包子");
                    try {
                        object.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("我要吃包子了");
                }
            }
        }.start();
        new Thread() {
            @Override
            public void run() {
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (object) {
                    System.out.println("包子做好了");
                    object.notify();
                }
            }
        }.start();
    }
}
