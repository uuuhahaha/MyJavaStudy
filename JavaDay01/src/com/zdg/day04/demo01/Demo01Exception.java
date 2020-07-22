package com.zdg.day04.demo01;
/*
* 自定义异常
* */
public class Demo01Exception extends RuntimeException {
    public Demo01Exception() {
        super();
    }

    public Demo01Exception(String message) {
        super(message);
    }
}
