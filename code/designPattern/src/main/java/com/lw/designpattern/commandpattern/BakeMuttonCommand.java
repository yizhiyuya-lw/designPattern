package com.lw.designpattern.commandpattern;

/**
 * 命令模式 -- 具体Command实现
 * @author lw
 * @create 2025-04-27-15:19
 */
public class BakeMuttonCommand extends Command {

    public BakeMuttonCommand(Barbecuer receiver) {
        super(receiver);
    }

    @Override
    public void executeCommand() {
        receiver.bakeMutton();
    }
}
