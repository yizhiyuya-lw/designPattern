package com.lw.designpattern.factorymethod;

/**
 * @author lw
 * @create 2025-04-24-21:35
 */
public class PhoneProduct implements Product {
    @Override
    public void show() {
        System.out.println("I'm phone");
    }
}
