package com.lw.designpattern.statepattern;

/**
 * @author lw
 * @create 2025-04-26-16:13
 */
public class SleepingState implements State {
    @Override
    public void handle(Work work) {
        System.out.println("当前时间：" + work.getHour() + " 不行了，睡了");
    }
}
