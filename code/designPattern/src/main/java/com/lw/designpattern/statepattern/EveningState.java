package com.lw.designpattern.statepattern;

/**
 * @author lw
 * @create 2025-04-26-16:09
 */
public class EveningState implements State {
    @Override
    public void handle(Work work) {
        if (work.isFinish()) {
            work.setState(new RestState());
            work.doHandle();
        } else {
            if (work.getHour() < 21) {
                System.out.println("当前时间：" + work.getHour() + " 加班呢，疲累之极");
            } else {
                work.setState(new SleepingState());
                work.doHandle();
            }
        }
    }
}
