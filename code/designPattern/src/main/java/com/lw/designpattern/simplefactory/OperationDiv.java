package com.lw.designpattern.simplefactory;

/**
 * 除法计算
 * @author lw
 * @create 2025-04-22-21:16
 */
public class OperationDiv extends Operation {
    @Override
    public double getResult() {
        if (getNumberB() == 0.0) {
            throw new IllegalArgumentException("除数不能为0");
        }
        return getNumberA() / getNumberB();
    }
}
