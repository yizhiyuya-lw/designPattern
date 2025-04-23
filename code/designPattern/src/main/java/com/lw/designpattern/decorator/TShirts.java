package com.lw.designpattern.decorator;

/**
 * @author lw
 * @create 2025-04-23-22:18
 */
public class TShirts extends Finery {

    @Override
    public void show() {
        System.out.println("大T恤");
        super.show();
    }
}
