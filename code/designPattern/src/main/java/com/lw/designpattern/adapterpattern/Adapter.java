package com.lw.designpattern.adapterpattern;

/**
 * 适配器
 * @author lw
 * @create 2025-04-26-16:50
 */
public class Adapter extends Target {

    private Adaptee adaptee = new Adaptee();
    @Override
    public void request() {
        adaptee.specificRequest();
    }
}
