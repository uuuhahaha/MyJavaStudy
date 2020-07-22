package com.zdg.day02;

import java.util.Random;
/*
* 输出随机数
*
* */
public class RandomDemo01 {
    public static void main(String[] args) {
        Random random = new Random();

        for (int i = 0; i <10 ; i++) {
            double result = random.nextDouble();
            System.out.println(result);
        }
    }
}
