package com.lw.designpattern.strategypattern;

/**
 * 打折优惠
 * @author lw
 * @create 2025-04-22-22:13
 */
public class CashRebateStrategy implements CashStrategy {

    // 折扣率
    private double moneyRebate = 1.0;

    public CashRebateStrategy(double moneyRebate) {
        this.moneyRebate = moneyRebate;
    }

    @Override
    public double acceptCash(double money) {
        return money * this.moneyRebate;
    }
}
