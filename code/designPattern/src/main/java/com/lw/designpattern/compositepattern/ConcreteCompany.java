package com.lw.designpattern.compositepattern;

import java.util.ArrayList;
import java.util.List;

/**
 * 组合模式 -- 组合组件 树枝节点
 * @author lw
 * @create 2025-04-26-23:16
 */
public class ConcreteCompany extends AbstractCompany {

    private final List<AbstractCompany> children = new ArrayList<>();

    public ConcreteCompany(String name) {
        super(name);
    }

    @Override
    public void add(AbstractCompany company) {
        children.add(company);
    }

    @Override
    public void remove(AbstractCompany company) {
        children.remove(company);
    }

    @Override
    public void display(int depth) {
        System.out.println(getDepthLineStr(depth) + this.name);
        for (AbstractCompany child : children) {
            child.display(depth + 2);
        }
    }

    @Override
    public void lineOfDuty() {
        for (AbstractCompany child : children) {
            child.lineOfDuty();
        }
    }
}
