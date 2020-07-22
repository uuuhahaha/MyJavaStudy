package com.zdg.day01.demo;

public class demo2 {
    public static void main(String[] args) {
        int[] ArraryA = new int[3];
        System.out.println(ArraryA[0]);
        System.out.println(ArraryA[1]);
        System.out.println(ArraryA[2]);
        ArraryA[0] = 10;
        ArraryA[1] = 20;

        int[] ArraryB = ArraryA;
        System.out.println(ArraryB[0]);
        System.out.println(ArraryB[1]);
        System.out.println(ArraryB[2]);

        ArraryB[0] = 100;

        System.out.println(ArraryA[0]);

        for (int i = 0; i < ArraryA.length; i++) {
            System.out.println(ArraryA[i]);
        }
    }
}
