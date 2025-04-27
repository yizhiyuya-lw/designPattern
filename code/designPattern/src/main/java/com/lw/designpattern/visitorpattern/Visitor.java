package com.lw.designpattern.visitorpattern;

/**
 * 访问者模式 -- 访问者
 * @author lw
 * @create 2025-04-27-21:37
 */
public interface Visitor {

    void visitElementA(ElementA elementA);

    void visitElementB(ElementB elementB);
}
