package com.zdg.day04.demo02;

/*
* Lock锁
* */

public class LMainDemo01{

    public static void main(String[] args) {
        LockDemo01 lockDemo01 = new LockDemo01();

        Thread thread1 = new Thread(lockDemo01);
        Thread thread2 = new Thread(lockDemo01);
        Thread thread3 = new Thread(lockDemo01);

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
