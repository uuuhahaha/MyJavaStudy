package com.zdg.day02.RedPacket;

public class RedPacket {
    public static void main(String[] args) {
        Manager manager = new Manager("群主", 2500);

        Member member1 = new Member("成员1", 100);
        Member member2 = new Member("成员1", 25);
        Member member3 = new Member("成员1", 30);
        Member member4 = new Member("成员1", 40);
        Member member5 = new Member("成员1", 100);

        manager.show();
        member1.show();
        member2.show();
        member3.show();
        member4.show();
        member5.show();

        double eachmoney = manager.send(5, 500);
        manager.setMoney(manager.getMoney()-500);
        member1.receive(eachmoney);
        member2.receive(eachmoney);
        member3.receive(eachmoney);
        member4.receive(eachmoney);
        member5.receive(eachmoney);

        manager.show();
        member1.show();
        member2.show();
        member3.show();
        member4.show();
        member5.show();
    }
}
