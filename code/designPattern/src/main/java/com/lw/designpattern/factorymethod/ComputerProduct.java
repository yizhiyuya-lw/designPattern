package com.lw.designpattern.factorymethod;

/**
 * @author lw
 * @create 2025-04-24-21:34
 */
public class ComputerProduct implements Product {
    @Override
    public void show() {
        System.out.println("I'm computer");
    }
}
