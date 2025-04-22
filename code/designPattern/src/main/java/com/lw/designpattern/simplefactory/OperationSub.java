package com.lw.designpattern.simplefactory;

/**
 * 减法计算
 * @author lw
 * @create 2025-04-22-21:15
 */
public class OperationSub extends Operation {
    @Override
    public double getResult() {
        return getNumberA() - getNumberB();
    }
}
