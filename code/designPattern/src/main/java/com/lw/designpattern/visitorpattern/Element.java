package com.lw.designpattern.visitorpattern;

/**
 * 访问者模式 -- 具体元素，接收访问者
 * @author lw
 * @create 2025-04-27-21:36
 */
public interface Element {

    void accept(Visitor visitor);
}
