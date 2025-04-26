package com.lw.designpattern.statepattern;

/**
 * @author lw
 * @create 2025-04-26-16:07
 */
public class AfternoonState implements State {
    @Override
    public void handle(Work work) {
        if (work.getHour() < 17) {
            System.out.println("当前时间: " + work.getHour() + " 下午状态还不错，继续努力");
        } else {
            work.setState(new EveningState());
            work.doHandle();
        }
    }
}
