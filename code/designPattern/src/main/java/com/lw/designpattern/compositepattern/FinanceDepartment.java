package com.lw.designpattern.compositepattern;

/**
 * 组合模式 -- Leaf组件
 * @author lw
 * @create 2025-04-26-23:15
 */
public class FinanceDepartment extends AbstractCompany {

    public FinanceDepartment(String name) {
        super(name);
    }

    @Override
    public void add(AbstractCompany company) {

    }

    @Override
    public void remove(AbstractCompany company) {

    }

    @Override
    public void display(int depth) {
        System.out.println(getDepthLineStr(depth) + this.name);
    }

    @Override
    public void lineOfDuty() {
        System.out.println(this.name + " 公司财务收支管理");
    }
}
