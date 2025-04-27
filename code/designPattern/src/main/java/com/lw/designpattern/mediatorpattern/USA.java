package com.lw.designpattern.mediatorpattern;

/**
 * 中介者模式 -- 具体实现Colleague
 * @author lw
 * @create 2025-04-27-17:11
 */
public class USA extends Country{

    public USA(UnitedNations unitedNations) {
        super(unitedNations);
    }

    // 声明
    public void declare(String message) {
        this.unitedNations.declare(message, this);
    }

    // 获得消息
    public void getMessage(String message) {
        System.out.println("美国获得对方消息：" + message);
    }
}
