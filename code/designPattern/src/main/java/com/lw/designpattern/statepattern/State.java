package com.lw.designpattern.statepattern;

/**
 * 状态模式--抽象状态
 * @author lw
 * @create 2025-04-26-15:57
 */
public interface State {

    void handle(Work work);
}
