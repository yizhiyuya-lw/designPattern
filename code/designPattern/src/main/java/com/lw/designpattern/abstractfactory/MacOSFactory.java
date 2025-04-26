package com.lw.designpattern.abstractfactory;

/**
 * 具体工厂
 * @author lw
 * @create 2025-04-26-14:08
 */
public class MacOSFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new MacOSCheckBox();
    }
}
