package com.zdg.day02;

import java.util.Arrays;
/*
*字符串排序输出
* */
public class Demo04Arrays {
    public static void main(String[] args) {
        String str = "fjhkahiuzyjwbbdhk";

        char[] chars = str.toCharArray();

        Arrays.sort(chars);

        System.out.println(Arrays.toString(chars));
    }
}
