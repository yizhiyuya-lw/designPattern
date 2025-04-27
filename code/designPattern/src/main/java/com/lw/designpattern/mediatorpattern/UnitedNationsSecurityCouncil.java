package com.lw.designpattern.mediatorpattern;

/**
 * 中介者模式 -- 中介者具体实现类
 * @author lw
 * @create 2025-04-27-17:14
 */
public class UnitedNationsSecurityCouncil implements UnitedNations {

    // 要知道所有的 colleague
    private USA colleague1;
    private Iraq colleague2;

    public void setColleague1(USA colleague1) {
        this.colleague1 = colleague1;
    }

    public void setColleague2(Iraq colleague2) {
        this.colleague2 = colleague2;
    }

    @Override
    public void declare(String message, Country colleague) {
        if (colleague == colleague1) {
            colleague2.getMessage(message);
        } else {
            colleague1.getMessage(message);
        }
    }
}
