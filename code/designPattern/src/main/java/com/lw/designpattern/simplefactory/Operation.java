package com.lw.designpattern.simplefactory;

/**
 * 计算器基类
 * @author lw
 * @create 2025-04-22-21:06
 */
public abstract class Operation {

    private double numberA = 0;
    private double numberB = 0;

    public Operation() {

    }

    public Operation(double numberA, double numberB) {
        this.numberA = numberA;
        this.numberB = numberB;
    }

    public double getNumberA() {
        return numberA;
    }

    public void setNumberA(double numberA) {
        this.numberA = numberA;
    }

    public double getNumberB() {
        return numberB;
    }

    public void setNumberB(double numberB) {
        this.numberB = numberB;
    }

    public abstract double getResult();
}
