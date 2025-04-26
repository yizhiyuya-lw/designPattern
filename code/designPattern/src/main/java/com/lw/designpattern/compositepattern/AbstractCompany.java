package com.lw.designpattern.compositepattern;

/**
 * 组合模式 -- Component组件接口
 * @author lw
 * @create 2025-04-26-23:07
 */
public abstract class AbstractCompany {

    protected String name;

    public AbstractCompany(String name) {
        this.name = name;
    }

    public abstract void add(AbstractCompany company);

    public abstract void remove(AbstractCompany company);

    public abstract void display(int depth);

    public abstract void lineOfDuty(); // 履行职责

    // 模板方法
    protected String getDepthLineStr(int depth) {
        StringBuilder sb = new StringBuilder("");
        if (depth < 1) {
            throw new IllegalArgumentException("depth can not less 1");
        }

        for (int i = 0; i < depth; i++) {
            sb.append("-");
        }
        return sb.toString();
    }
}
