package com.zdg.day02;

import java.util.Scanner;

public class demo01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入一个数字：");
        int a = sc.nextInt();

        System.out.println("请再输入一个数字：");
        int b = sc.nextInt();

        int result = a + b;

        System.out.println("和为"+result);
    }
}
