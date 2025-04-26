package com.lw.designpattern.builderpattern;

/**
 * 建造者模式--指挥者
 * @author lw
 * @create 2025-04-26-9:48
 */
public class Director {

    public void construct(Builder builder) {
        builder.buildPartA("aaa");
        builder.buildPartB("bbb");
    }
}
