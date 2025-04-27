package com.lw.designpattern.singletonpattern;

/**
 * 单例模式--饿汉式
 * @author lw
 * @create 2025-04-27-11:23
 */
public class HungrySingleton {

    private static final HungrySingleton instance = new HungrySingleton();

    private HungrySingleton() {

    }

    public static HungrySingleton getInstance() {
        return HungrySingleton.instance;
    }
}
