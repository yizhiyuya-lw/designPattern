package com.lw.designpattern.simplefactory;

/**
 * @author lw
 * @create 2025-04-22-21:21
 */
public class MainTest {

    public static void main(String[] args) {
        Operation operation = OperationFactory.createOperation("+");
        operation.setNumberA(1.1);
        operation.setNumberB(2.2);
        System.out.println("加法计算结果：" + operation.getResult());
    }
}
