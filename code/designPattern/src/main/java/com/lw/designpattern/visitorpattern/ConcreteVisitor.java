package com.lw.designpattern.visitorpattern;

/**
 * 访问者模式 -- 具体访问者
 * @author lw
 * @create 2025-04-27-21:41
 */
public class ConcreteVisitor implements Visitor {
    @Override
    public void visitElementA(ElementA elementA) {
        System.out.println("访问：" + elementA.getClass().getSimpleName());
    }

    @Override
    public void visitElementB(ElementB elementB) {
        System.out.println("访问：" + elementB.getClass().getSimpleName());
    }
}
