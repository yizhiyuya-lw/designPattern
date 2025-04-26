package com.lw.designpattern.compositepattern;

/**
 * 组合模式-- Leaf节点组件
 * @author lw
 * @create 2025-04-26-23:10
 */
public class HrDepartment extends AbstractCompany {

    public HrDepartment(String name) {
        super(name);
    }

    @Override
    public void add(AbstractCompany company) {
        // 叶子节点  do nothing
    }

    @Override
    public void remove(AbstractCompany company) {
        // 叶子节点  do nothing
    }

    @Override
    public void display(int depth) {
        System.out.println(getDepthLineStr(depth) + this.name);
    }

    @Override
    public void lineOfDuty() {
        System.out.println(this.name + " 员工招聘培训管理");
    }
}
