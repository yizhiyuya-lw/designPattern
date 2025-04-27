package com.lw.designpattern.mediatorpattern;

/**
 * @author lw
 * @create 2025-04-27-17:13
 */
public class Iraq extends Country {

    public Iraq(UnitedNations unitedNations) {
        super(unitedNations);
    }

    // 声明
    public void declare(String message) {
        this.unitedNations.declare(message, this);
    }

    // 获得消息
    public void getMessage(String message) {
        System.out.println("伊拉克获得对方消息：" + message);
    }
}
