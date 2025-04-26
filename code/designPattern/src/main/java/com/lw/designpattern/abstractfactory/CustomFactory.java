package com.lw.designpattern.abstractfactory;

/**
 * 利用反射，优化抽象工厂
 * @author lw
 * @create 2025-04-26-14:20
 */
public class CustomFactory implements GUIFactory {

    private static final String systemName = "MacOS";

    @Override
    public Button createButton() {
        try {
            return (Button) Class.forName("com.lw.designpattern.abstractfactory." + systemName + "Button").getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public CheckBox createCheckBox() {
        try {
            return (CheckBox) Class.forName("com.lw.designpattern.abstractfactory." + systemName + "CheckBox").getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
