package com.lw.designpattern.compositepattern;

/**
 * @author lw
 * @create 2025-04-26-23:18
 */
public class DemoTest {

    public static void main(String[] args) {

        AbstractCompany root = new ConcreteCompany("北京总公司");
        root.add(new HrDepartment("总公司人力资源部"));
        root.add(new FinanceDepartment("总公司财务部"));

        AbstractCompany comp = new ConcreteCompany("上海华东分公司");
        comp.add(new HrDepartment("华东分公司人力资源部"));
        comp.add(new FinanceDepartment("华东分公司财务部"));
        root.add(comp);

        AbstractCompany comp1 = new ConcreteCompany("南京办事处");
        comp1.add(new HrDepartment("南京办事处人力资源部"));
        comp1.add(new FinanceDepartment("南京办事处财务部"));
        root.add(comp1);

        AbstractCompany comp2 = new ConcreteCompany("杭州办事处");
        comp2.add(new HrDepartment("杭州办事处人力资源部"));
        comp2.add(new FinanceDepartment("杭州办事处财务部"));
        root.add(comp2);

        System.out.println("结构图：");
        root.display(1);

        System.out.println("职责：");
        root.lineOfDuty();
    }
}
