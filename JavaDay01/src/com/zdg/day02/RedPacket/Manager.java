package com.zdg.day02.RedPacket;

public class Manager extends User {
    public Manager(String name, double money) {
        super(name, money);
    }

    public double send(int count, double totalMoney) {
        double money = this.getMoney();
        double eachMoney = 0;

        if (money > totalMoney) {
            eachMoney = totalMoney / count;
        } else {
            System.out.println("金额不足");
        }
        return eachMoney;
    }
}
