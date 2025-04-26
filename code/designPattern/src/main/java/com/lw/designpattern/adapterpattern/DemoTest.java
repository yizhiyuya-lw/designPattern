package com.lw.designpattern.adapterpattern;

/**
 * @author lw
 * @create 2025-04-26-16:51
 */
public class DemoTest {

    public static void main(String[] args) {
        Target target1 = new Target();
        Target adapter = new Adapter();

        target1.request();
        adapter.request();
    }
}
