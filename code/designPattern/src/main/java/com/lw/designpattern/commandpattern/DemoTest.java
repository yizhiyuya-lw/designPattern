package com.lw.designpattern.commandpattern;

/**
 * @author lw
 * @create 2025-04-27-15:27
 */
public class DemoTest {

    public static void main(String[] args) {
        // 运行前准备
        Barbecuer boss = new Barbecuer();
        Command bakeMuttonCommand1 = new BakeMuttonCommand(boss);
        Command bakeMuttonCommand2 = new BakeMuttonCommand(boss);
        Command bakeChickenWingCommand1 = new BakeChickenWingCommand(boss);

        Waiter waiter = new Waiter();

        // 点菜
        waiter.setOrder(bakeMuttonCommand1);
        waiter.setOrder(bakeMuttonCommand2);
        waiter.setOrder(bakeChickenWingCommand1);

        // 取消
        waiter.cancelOrder(bakeMuttonCommand2);

        // 下单
        waiter.submitOrders();
    }
}
