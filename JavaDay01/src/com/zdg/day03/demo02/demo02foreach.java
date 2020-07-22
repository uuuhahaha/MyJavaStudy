package com.zdg.day03.demo02;

import java.util.ArrayList;
import java.util.List;

/*
* 增强for循环
* */

public class demo02foreach {
    public static void main(String[] args) {
        List<Integer> arrayA = new ArrayList<>();

        arrayA.add(1);
        arrayA.add(2);
        arrayA.add(3);
        arrayA.add(4);
        arrayA.add(5);

        for (int i : arrayA) {
            System.out.println(i);
        }

    }
}
