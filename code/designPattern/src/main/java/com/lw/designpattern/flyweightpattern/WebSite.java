package com.lw.designpattern.flyweightpattern;

/**
 * 享元模式 -- FlyWeight 抽象接口
 * @author lw
 * @create 2025-04-27-20:29
 */
public interface WebSite {

    // 外部对象使用参数传递
    void use(User user);
}
