package com.lw.designpattern.strategypattern;

/**
 * @author lw
 * @create 2025-04-22-22:18
 */
public class CashContext {

    private CashStrategy cashStrategy;

    public CashContext(String type) {
        switch (type) {
            case "normal":
                cashStrategy = new CashNormalStrategy();
                break;
            case "rebate":
                cashStrategy = new CashRebateStrategy(0.8);
                break;
            case "return":
                cashStrategy = new CashReturnStrategy(300, 40);
                break;
        }
    }

    public double getResult(double money) {
        return cashStrategy.acceptCash(money);
    }
}
