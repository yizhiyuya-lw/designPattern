package com.lw.designpattern.chainpattern;

/**
 * @author lw
 * @create 2025-04-27-16:01
 */
public abstract class AbstractManager implements Manager {

    protected String name;

    // 上级
    protected Manager superior;

    public AbstractManager(String name) {
        this.name = name;
    }

    @Override
    public void setSuperior(Manager superior) {
        this.superior = superior;
    }
}
