package com.lw.designpattern.singletonpattern;

/**
 * @author lw
 * @create 2025-04-27-11:21
 */
public class DemoTest {

    public static void main(String[] args) {
        HungrySingleton hungry1 = HungrySingleton.getInstance();
        HungrySingleton hungry2 = HungrySingleton.getInstance();
        System.out.println(hungry1 == hungry2);

        LazySingleton lazy1 = LazySingleton.getInstance();
        LazySingleton lazy2 = LazySingleton.getInstance();
        System.out.println(lazy1 == lazy2);
    }
}
