package com.lw.designpattern.decorator;

/**
 * 装饰模式 对应 Component
 * @author lw
 * @create 2025-04-23-22:13
 */
public class Person {

    private String name;

    public Person() {

    }

    public Person(String name) {
        this.name = name;
    }

    public void show() {
        System.out.println("name: " + name);
    }

}
