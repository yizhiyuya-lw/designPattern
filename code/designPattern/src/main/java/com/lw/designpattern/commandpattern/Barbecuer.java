package com.lw.designpattern.commandpattern;

/**
 * 命令模式 -- Receiver 实际执行者
 * @author lw
 * @create 2025-04-27-15:15
 */
public class Barbecuer {

    public void bakeMutton() {
        System.out.println("烤羊肉串...");
    }

    public void bakeChickenWing() {
        System.out.println("烤鸡翅...");
    }
}
