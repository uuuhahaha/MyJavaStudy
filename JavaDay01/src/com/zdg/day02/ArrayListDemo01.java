package com.zdg.day02;

import java.util.ArrayList;
import java.util.Random;
/*
* 筛选集合中的偶数
* */
public class ArrayListDemo01 {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> bigList = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            bigList.add(random.nextInt(100)+1);
        }

        ArrayList<Integer> smallList = ArrayListDemo01.getSmallList(bigList);

        System.out.println("总共有："+smallList.size());
        for (int i = 0; i < smallList.size(); i++) {
            System.out.println(smallList.get(i));
        }
    }
    public static ArrayList<Integer> getSmallList(ArrayList<Integer> bigList) {
        ArrayList<Integer> smallList = new ArrayList<>();

        for (int i = 0; i < bigList.size(); i++) {
            if (bigList.get(i) % 2 == 0) {
                smallList.add(bigList.get(i));
            }
        }
        return smallList;
    }
}
