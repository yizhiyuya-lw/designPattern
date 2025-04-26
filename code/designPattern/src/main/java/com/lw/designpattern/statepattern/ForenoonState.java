package com.lw.designpattern.statepattern;

/**
 * 状态模式--具体状态处理类
 * @author lw
 * @create 2025-04-26-16:02
 */
public class ForenoonState implements State {
    @Override
    public void handle(Work work) {
        if (work.getHour() < 12) {
            System.out.println("当前时间: " + work.getHour() + " 上午工作，精神百倍");
        } else {
            // 切换状态
            work.setState(new NoonState());
            work.doHandle();
        }
    }
}
