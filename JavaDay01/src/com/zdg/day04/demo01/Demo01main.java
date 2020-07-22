package com.zdg.day04.demo01;

import java.util.Scanner;

public class Demo01main {
    private static String[] user = {"张三", "李四", "王二"};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个用户名");
        String name = scanner.next();
        checkname(name);
    }

    public static void checkname(String name) {
        for (String s : user) {
            if (s.equals(name)) {
                throw new Demo01Exception("用户已存在");
            }
        }
        System.out.println("注册成功");
    }
}
