package com.lw.designpattern.bridgepattern;

/**
 * 桥接模式 -- 提炼的抽象
 * @author lw
 * @create 2025-04-27-12:22
 */
public class RefinedAbstraction extends Abstraction {
    @Override
    public void operation() {
        implementor.operation();
    }
}
