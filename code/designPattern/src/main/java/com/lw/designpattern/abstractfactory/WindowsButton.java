package com.lw.designpattern.abstractfactory;

/**
 * 具体产品--windowsButton
 * @author lw
 * @create 2025-04-26-14:03
 */
public class WindowsButton implements Button {
    @Override
    public void render() {
        System.out.println("Windows Button");
    }
}
