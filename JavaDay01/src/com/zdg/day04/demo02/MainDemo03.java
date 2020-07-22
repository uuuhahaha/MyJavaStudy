package com.zdg.day04.demo02;

/*
* 匿名内部类的实现
* */

public class MainDemo03 {
    public static void main(String[] args) {
        new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    System.out.println(i);
                }
            }
        }.start();

        Runnable runnable = new Runnable(){
            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    System.out.println("Runnable方法一" + i);
                }
            }
        };

        Thread thread = new Thread(runnable);
        thread.start();

        new Thread(new Runnable(){
            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    System.out.println("Runnable方法二" + i);
                }
            }
        }).start();
    }
}
