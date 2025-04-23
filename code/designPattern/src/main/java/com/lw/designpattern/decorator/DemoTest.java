package com.lw.designpattern.decorator;

/**
 * @author lw
 * @create 2025-04-23-22:20
 */
public class DemoTest {

    public static void main(String[] args) {
        Person p = new Person("小菜");
        System.out.println("第一种装扮：");

        TShirts tShirts = new TShirts();
        tShirts.setPerson(p);
        BigTrouser bigTrouser = new BigTrouser();
        bigTrouser.setPerson(tShirts);
        bigTrouser.show();
    }
}
