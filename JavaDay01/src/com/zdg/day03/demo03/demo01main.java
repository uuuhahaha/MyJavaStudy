package com.zdg.day03.demo03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
* Colleections 的sort排序
*   自定义类需要重写compareTo
* */

public class demo01main {
    public static void main(String[] args) {
        Person person0 = new Person("bcd", 18);
        Person person1 = new Person("acd", 18);
        Person person2 = new Person("abc", 18);

        List<Person> ArrayPerson = new ArrayList<>();
        Collections.addAll(ArrayPerson, person0, person1, person2);

        Collections.sort(ArrayPerson);

        System.out.println(ArrayPerson);
        
    }
}
