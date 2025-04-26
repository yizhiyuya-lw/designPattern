package com.lw.designpattern.abstractfactory;

/**
 * @author lw
 * @create 2025-04-26-14:09
 */
public class DemoTest {

    public static void main(String[] args) {
        GUIFactory windowsFactory = new WindowsFactory();
        Button windowsButton = windowsFactory.createButton();
        CheckBox windowsCheckBox = windowsFactory.createCheckBox();
        windowsButton.render();
        windowsCheckBox.render();

        GUIFactory macOsFactory = new MacOSFactory();
        Button macOSButton = macOsFactory.createButton();
        CheckBox macOSCheckBox = macOsFactory.createCheckBox();
        macOSButton.render();
        macOSCheckBox.render();

        System.out.println("---------------------------");

        GUIFactory customFactory = new CustomFactory();
        customFactory.createButton().render();
        customFactory.createCheckBox().render();
    }
}
