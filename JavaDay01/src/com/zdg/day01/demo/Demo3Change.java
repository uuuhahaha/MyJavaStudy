package com.zdg.day01.demo;

public class Demo3Change {
    public static void main(String[] args) {
        int[] ArrayA = {10, 20, 65, 41, 25, 36, 48, 50, 65, 65, 100, 5};

        int min = 0;
        int max = ArrayA.length-1;
        //int change;
        while (min < max) {
            if (ArrayA[min] > ArrayA[max]) {
                int change = ArrayA[min];
                ArrayA[min] = ArrayA[max];
                ArrayA[max] = change;
            }
            ++min;
            --max;
        }
        for (int i = 0; i < ArrayA.length; i++) {
            System.out.println(ArrayA[i]);
        }
    }
}
