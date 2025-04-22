package com.lw.designpattern.simplefactory;

/**
 * 加法计算
 * @author lw
 * @create 2025-04-22-21:08
 */
public class OperationAdd extends Operation {
    @Override
    public double getResult() {
        return getNumberA() + getNumberB();
    }
}
