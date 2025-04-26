package com.lw.designpattern.abstractfactory;

/**
 * 具体工厂实现
 * @author lw
 * @create 2025-04-26-14:08
 */
public class WindowsFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new WindowsCheckBox();
    }
}
