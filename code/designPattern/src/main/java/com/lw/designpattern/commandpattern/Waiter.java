package com.lw.designpattern.commandpattern;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * 命令模式 -- invoke 设置命令并下达命令
 * @author lw
 * @create 2025-04-27-15:21
 */
public class Waiter {

    private List<Command> orders = new ArrayList<>();

    public void setOrder(Command command) {
        if (command instanceof BakeChickenWingCommand) {
            System.out.println("服务员：鸡翅没有了，请点别的烧烤");
        } else {
            orders.add(command);
            System.out.println("增加订单：" + command.getClass().getSimpleName() + " 时间：" + LocalDateTime.now());
        }
    }

    public void cancelOrder(Command command) {
        orders.remove(command);
        System.out.println("取消订单：" + command.getClass().getSimpleName() + " 时间：" + LocalDateTime.now());
    }

    public void submitOrders() {
        for (Command command : orders) {
            command.executeCommand();
        }
    }
}
