package com.lw.designpattern.observerpattern;

/**
 * 观察者模式--主题（被观察者）接口
 * @author lw
 * @create 2025-04-26-11:57
 */
public interface Subject {

    // 注册观察者
    void register(Observer observer);

    // 移除观察者
    void remove(Observer observer);

    // 通知观察者
    void notify(String state);

    // 更新状态
    void setState(String state);
}
