package com.lw.designpattern.visitorpattern;

/**
 * 具体元素
 * @author lw
 * @create 2025-04-27-21:38
 */
public class ElementB  implements Element {
    @Override
    public void accept(Visitor visitor) {
        visitor.visitElementB(this);
    }

    public void otherOperation() {}
}
