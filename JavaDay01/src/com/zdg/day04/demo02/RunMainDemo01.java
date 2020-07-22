package com.zdg.day04.demo02;

/*
    相比Thread的优势
*   避免单继承
*   解耦
* */
public class RunMainDemo01 {
    public static void main(String[] args) {
        RunnableDemo01 runnableDemo01 = new RunnableDemo01();

        Thread thread = new Thread(runnableDemo01);

        thread.start();
    }
}
