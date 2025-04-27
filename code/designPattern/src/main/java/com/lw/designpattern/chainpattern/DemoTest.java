package com.lw.designpattern.chainpattern;

/**
 * @author lw
 * @create 2025-04-27-16:09
 */
public class DemoTest {

    public static void main(String[] args) {

        Manager jinli = new CommonManager("经理");
        Manager zongjian = new MajordomoManager("总监");
        Manager zongjingli = new GeneralManager("总经理");
        jinli.setSuperior(zongjian);
        zongjian.setSuperior(zongjingli);

        jinli.handle(new Request("请假", "小菜请假", 1));

        jinli.handle(new Request("请假", "小菜请假", 4));

        jinli.handle(new Request("请假", "小菜请假", 6));

        jinli.handle(new Request("加薪", "小菜加薪", 500));

        jinli.handle(new Request("加薪", "小菜加薪", 1000));

        jinli.handle(new Request("调休", "小菜调休", 1));
    }
}
