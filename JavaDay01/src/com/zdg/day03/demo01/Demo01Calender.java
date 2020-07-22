package com.zdg.day03.demo01;

import java.util.Arrays;

/*
 * System类
 * */
public class Demo01Calender {
    public static void main(String[] args) {
        demo02();
    }

    private static void demo02() {
        int[] src = {1, 3, 5, 7, 9};
        int[] dest = {2, 4, 6, 8, 10};

        System.out.println(Arrays.toString(dest));

        System.arraycopy(src, 0, dest, 0, 3);

        System.out.println(Arrays.toString(dest));

    }

    private static void demo01() {
        long s = System.currentTimeMillis();

        for (int i = 0; i < 99999; i++) {
            System.out.println(i);
        }

        long e = System.currentTimeMillis();

        System.out.println(e - s);
    }
}
