package com.lw.designpattern.strategypattern;

/**
 * 优惠策略
 * @author lw
 * @create 2025-04-22-22:09
 */
public interface CashStrategy {

    /**
     * 根据价格返回具体优惠后金额
     * @param money
     * @return
     */
    double acceptCash(double money);
}
