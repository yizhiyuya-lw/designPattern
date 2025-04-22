package com.lw.designpattern.simplefactory;

/**
 * 简单工厂类
 * @author lw
 * @create 2025-04-22-21:18
 */
public class OperationFactory {

    /**
     * 根据类型获取对应的计算类
     * @param type
     * @return
     */
    public static Operation createOperation(String type) {
        Operation operation = null;

        switch (type) {
            case "+":
                operation = new OperationAdd();
                break;
            case "-":
                operation = new OperationSub();
                break;
            case "*":
                operation = new OperationMul();
                break;
            case "/":
                operation = new OperationDiv();
                break;
        }
        return operation;
    }
}
