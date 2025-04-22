package com.lw.designpattern.strategypattern;

/**
 * @author lw
 * @create 2025-04-22-22:22
 */
public class MailTest {

    public static void main(String[] args) {
        double money = 310;
        CashContext normalContext = new CashContext("normal");
        CashContext rebateContext = new CashContext("rebate");
        CashContext returnContext = new CashContext("return");

        System.out.println("normal: " + normalContext.getResult(money));
        System.out.println("rebate: " + rebateContext.getResult(money));
        System.out.println("return: " + returnContext.getResult(money));
    }
}
