package com.lw.designpattern.flyweightpattern;

/**
 * @author lw
 * @create 2025-04-27-20:35
 */
public class DemoTest {

    public static void main(String[] args) {

        WebSiteFactory factory = new WebSiteFactory();

        WebSite fx = factory.getWebSite("产品展示");
        fx.use(new User("小菜"));

        WebSite fy = factory.getWebSite("产品展示");
        fy.use(new User("大鸟"));

        WebSite fz = factory.getWebSite("产品展示");
        fz.use(new User("娇娇"));

        WebSite fa = factory.getWebSite("博客");
        fa.use(new User("老顽童"));

        WebSite fb = factory.getWebSite("博客");
        fb.use(new User("桃谷六仙"));

        WebSite fc = factory.getWebSite("博客");
        fc.use(new User("南海鳄神"));

        System.out.println("网站分类总数量：" + factory.getWebSiteCount());
    }
}
