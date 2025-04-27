package com.lw.designpattern.singletonpattern;

/**
 * 单例模式 -- 懒汉式
 * @author lw
 * @create 2025-04-27-11:26
 */
public class LazySingleton {

    private static LazySingleton instance;

    private static final Object lock = new Object();

    private LazySingleton() {}

    public static LazySingleton getInstance() {

        if (LazySingleton.instance == null) {
            synchronized (lock) {
                if (LazySingleton.instance == null) {
                    LazySingleton.instance = new LazySingleton();
                }
            }
        }

        return instance;
    }
}
