package com.lw.designpattern.commandpattern;

/**
 * 命令模式 -- 具体command实现
 * @author lw
 * @create 2025-04-27-15:20
 */
public class BakeChickenWingCommand extends Command {

    public BakeChickenWingCommand(Barbecuer receiver) {
        super(receiver);
    }

    @Override
    public void executeCommand() {
        receiver.bakeChickenWing();
    }
}
