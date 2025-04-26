package com.lw.designpattern.statepattern;

/**
 * 状态模式--Context
 * @author lw
 * @create 2025-04-26-15:59
 */
public class Work {

    // 当前状态
    private State current;

    private int hour;

    private boolean finish = false;

    public Work() {
        // 默认起始状态
        current = new ForenoonState();
    }

    // 变更状态
    public void setState(State state) {
        this.current = state;
    }

    public void doHandle() {
        this.current.handle(this);
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public boolean isFinish() {
        return finish;
    }

    public void setFinish(boolean finish) {
        this.finish = finish;
    }
}
