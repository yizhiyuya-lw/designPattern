package com.lw.designpattern.bridgepattern;

/**
 * 桥接模式 -- 具体实现B
 * @author lw
 * @create 2025-04-27-12:20
 */
public class ImplementorB implements Implementor {
    @Override
    public void operation() {
        System.out.println("具体实现B的方法执行");
    }
}
