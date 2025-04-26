package com.lw.designpattern.abstractfactory;

/**
 * 具体产品--MacOSButton
 * @author lw
 * @create 2025-04-26-14:04
 */
public class MacOSButton implements Button {
    @Override
    public void render() {
        System.out.println("MacOS Button");
    }
}
