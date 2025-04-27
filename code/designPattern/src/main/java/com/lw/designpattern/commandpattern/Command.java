package com.lw.designpattern.commandpattern;

/**
 * 命令模式 -- 抽象命令接口
 * @author lw
 * @create 2025-04-27-15:18
 */
public abstract class Command {

    protected Barbecuer receiver;

    public Command(Barbecuer receiver) {
        this.receiver = receiver;
    }

    public abstract void executeCommand();
}
