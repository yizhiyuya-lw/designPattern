package com.lw.designpattern.statepattern;

/**
 * 具体状态实现
 * @author lw
 * @create 2025-04-26-16:05
 */
public class NoonState implements State {
    @Override
    public void handle(Work work) {
        if (work.getHour() < 13) {
            System.out.println("当前时间: " + work.getHour() + " 饿了，午饭；犯困，午休。");
        } else {
            work.setState(new AfternoonState());
            work.doHandle();
        }
    }
}
