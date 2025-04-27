package com.lw.designpattern.flyweightpattern;

/**
 * @author lw
 * @create 2025-04-27-20:31
 */
public class ConcreteWebSite implements WebSite {

    private String name;

    public ConcreteWebSite(String name) {
        this.name = name;
    }

    @Override
    public void use(User user) {
        System.out.println("网站分类：" + this.name + " 用户：" + user.getName());
    }
}
