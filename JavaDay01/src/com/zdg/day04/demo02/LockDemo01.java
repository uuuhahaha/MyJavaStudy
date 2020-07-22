package com.zdg.day04.demo02;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/*
* Lock锁
* */

public class LockDemo01  implements Runnable{
    private static int ticket = 100;
    Lock lock = new ReentrantLock();

    @Override
    public void run() {
        while (true) {
            lock.lock();
            if (ticket > 0) {
                try {
                    Thread.sleep(1);
                    System.out.println("出售票" + ticket + "-->剩余" + --ticket + "张");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    lock.unlock();
                }
            } else {
                break;
            }
        }
    }

}
