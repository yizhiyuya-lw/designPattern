package com.lw.designpattern.builderpattern;

/**
 * 建造者模式--Builder
 * @author lw
 * @create 2025-04-26-9:44
 */
public abstract class Builder {

    public abstract void buildPartA(String partA);
    public abstract void buildPartB(String partB);
    public abstract Product getResult();
}
