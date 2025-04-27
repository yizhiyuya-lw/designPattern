package com.lw.designpattern.visitorpattern;

/**
 * 具体元素
 * @author lw
 * @create 2025-04-27-21:37
 */
public class ElementA implements Element {
    @Override
    public void accept(Visitor visitor) {
        visitor.visitElementA(this);
    }

    public void otherOperation() {}
}
