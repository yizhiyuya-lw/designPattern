package com.lw.designpattern.decorator;

/**
 * @author lw
 * @create 2025-04-23-22:19
 */
public class BigTrouser extends Finery {

    @Override
    public void show() {
        System.out.println("垮裤");
        super.show();
    }
}
