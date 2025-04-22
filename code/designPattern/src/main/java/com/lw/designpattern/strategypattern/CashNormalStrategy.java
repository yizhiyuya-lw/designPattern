package com.lw.designpattern.strategypattern;

/**
 * 没有优惠
 * @author lw
 * @create 2025-04-22-22:12
 */
public class CashNormalStrategy implements CashStrategy {
    @Override
    public double acceptCash(double money) {
        return money;
    }
}
