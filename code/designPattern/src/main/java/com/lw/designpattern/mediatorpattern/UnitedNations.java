package com.lw.designpattern.mediatorpattern;

/**
 * 中介者模式 -- 中介者抽象类
 * @author lw
 * @create 2025-04-27-17:08
 */
public interface UnitedNations {

    void declare(String message, Country colleague);
}
