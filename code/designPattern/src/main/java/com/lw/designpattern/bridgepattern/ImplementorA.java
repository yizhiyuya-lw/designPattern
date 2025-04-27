package com.lw.designpattern.bridgepattern;

/**
 * 桥接模式 -- 具体实现
 * @author lw
 * @create 2025-04-27-12:19
 */
public class ImplementorA implements Implementor {
    @Override
    public void operation() {
        System.out.println("具体实现A的方法执行");
    }
}
