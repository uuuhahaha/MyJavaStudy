package com.zdg.day03.demo02;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

/*
* 迭代器的代码实现
* */

public class demo01collection {
    public static void main(String[] args) {
        Collection<Integer> arrayA = new HashSet<>();

        arrayA.add(1);
        arrayA.add(2);
        arrayA.add(3);
        arrayA.add(4);
        arrayA.add(5);

        Iterator iterator = arrayA.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
