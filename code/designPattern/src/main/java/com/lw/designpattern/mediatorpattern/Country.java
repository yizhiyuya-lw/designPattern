package com.lw.designpattern.mediatorpattern;

/**
 * 中介者模式 -- colleague抽象类
 * @author lw
 * @create 2025-04-27-17:07
 */
public abstract class Country {

    protected UnitedNations unitedNations;

    public Country(UnitedNations unitedNations) {
        this.unitedNations = unitedNations;
    }
}
