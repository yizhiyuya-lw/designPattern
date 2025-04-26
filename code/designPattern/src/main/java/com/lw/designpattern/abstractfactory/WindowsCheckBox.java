package com.lw.designpattern.abstractfactory;

/**
 * @author lw
 * @create 2025-04-26-14:06
 */
public class WindowsCheckBox implements CheckBox {
    @Override
    public void render() {
        System.out.println("Windows CheckBox");
    }
}
