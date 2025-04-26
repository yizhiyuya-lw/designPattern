package com.lw.designpattern.abstractfactory;

/**
 * 抽象工厂接口
 * @author lw
 * @create 2025-04-26-14:07
 */
public interface GUIFactory {

    Button createButton();
    CheckBox createCheckBox();
}
