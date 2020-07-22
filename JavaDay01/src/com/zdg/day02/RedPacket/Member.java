package com.zdg.day02.RedPacket;

public class Member extends User {
    public Member(String name, double money) {
        super(name, money);
    }

    public void receive(double eachmoney) {
        this.setMoney(this.getMoney()+eachmoney);
    }
}
