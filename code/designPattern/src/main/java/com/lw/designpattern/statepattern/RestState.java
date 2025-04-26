package com.lw.designpattern.statepattern;

/**
 * 终止状态
 * @author lw
 * @create 2025-04-26-16:10
 */
public class RestState implements State {
    @Override
    public void handle(Work work) {
        System.out.println("当前时间：" + work.getHour() + " 下班回家了");
    }
}
