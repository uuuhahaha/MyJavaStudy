package com.zdg.day04.demo02;

public class MainDemo02 {
    public static void main(String[] args) {
        ThreadDemo02 threadDemo02 = new ThreadDemo02();

        threadDemo02.start();

        System.out.println(Thread.currentThread().getName());
    }
}
