package com.lw.designpattern.bridgepattern;

/**
 * @author lw
 * @create 2025-04-27-12:23
 */
public class DemoTest {

    public static void main(String[] args) {

        Abstraction ab = new RefinedAbstraction();
        ab.setImplementor(new ImplementorA());
        ab.operation();

        ab.setImplementor(new ImplementorB());
        ab.operation();
    }
}
