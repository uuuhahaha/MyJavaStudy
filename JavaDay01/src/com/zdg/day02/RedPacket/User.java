package com.zdg.day02.RedPacket;
/*
* 用户类
* */
public class User {
    private String name; //用户姓名
    private double money; //剩余金额

    public User() {
    }

    public User(String name, double money) {
        this.name = name;
        this.money = money;
    }

    public void show() {
        System.out.println(name+"有多少钱："+money);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }
}
