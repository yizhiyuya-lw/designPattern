package com.lw.designpattern.flyweightpattern;

/**
 * 外部实例
 * @author lw
 * @create 2025-04-27-20:30
 */
public class User {

    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
