package com.lw.designpattern.facadepattern;

/**
 * @author lw
 * @create 2025-04-25-22:17
 */
public class Facade {

    private final SubSystemOne one;
    private final SubSystemTwo two;
    private final SubSystemThree three;

    public Facade() {
        this.one = new SubSystemOne();
        this.two = new SubSystemTwo();
        this.three = new SubSystemThree();
    }

    public void deal1() {
        System.out.println("deal1....");
        one.methodOne();
        two.methodTwo();
        three.methodThree();
    }

    public void deal2() {
        System.out.println("deal2....");
        three.methodThree();
        two.methodTwo();
        one.methodOne();
    }
}
