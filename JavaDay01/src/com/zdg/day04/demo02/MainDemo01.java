package com.zdg.day04.demo02;

/*
自定义线程
    Java线程抢占式调度
* */
public class MainDemo01 {
    public static void main(String[] args) {
        ThreadDemo01 threadDemo01 = new ThreadDemo01();

        threadDemo01.start();

        for (int i = 0; i < 1000; i++) {
            System.out.println("main" + i);
        }
    }
}
