package com.lw.designpattern.strategypattern;

/**
 * 满减优惠
 * @author lw
 * @create 2025-04-22-22:15
 */
public class CashReturnStrategy implements CashStrategy {

    // 满减条件
    private double moneyCondition;
    // 优惠金额
    private double moneyReturn;

    public CashReturnStrategy(double moneyCondition, double moneyReturn) {
        this.moneyCondition = moneyCondition;
        this.moneyReturn = moneyReturn;
    }

    @Override
    public double acceptCash(double money) {
        double result = money;
        if (money >= moneyCondition) {
            result = money - Math.floor(money / moneyCondition) * moneyReturn;
        }
        return result;
    }
}
