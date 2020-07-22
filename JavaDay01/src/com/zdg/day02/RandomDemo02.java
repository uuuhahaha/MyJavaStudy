package com.zdg.day02;

import java.util.Random;
import java.util.Scanner;
/*
* 猜数字小游戏
* */
public class RandomDemo02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int random = new Random().nextInt(100);

        while (true) {
            System.out.println("请输入一个数字");
            int num = scanner.nextInt();
            if (random == num) {
                System.out.println("输入正确");
                break;
            } else if (random > num) {
                System.out.println("太小了");
            } else {
                System.out.println("太大了");
            }
        }
    }
}
