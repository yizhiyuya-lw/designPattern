package com.lw.designpattern.bridgepattern;

/**
 * 桥接模式 -- 抽象
 * @author lw
 * @create 2025-04-27-12:21
 */
public abstract class Abstraction {

    protected Implementor implementor;

    public void setImplementor(Implementor implementor) {
        this.implementor = implementor;
    }

    public abstract void operation();
}
