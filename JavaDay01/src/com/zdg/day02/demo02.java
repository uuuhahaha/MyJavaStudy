package com.zdg.day02;

import java.util.Scanner;
/*
* 输出三数中的最大值
*
* */
public class demo02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入一个值：");
        int a = sc.nextInt();
        System.out.println("请输入一个值：");
        int b = sc.nextInt();
        System.out.println("请输入一个值：");
        int c = sc.nextInt();

        int temp = a > b ? a : b;
        int result = temp > c ? temp : c;

        System.out.println("结果为" + result);
    }
}
