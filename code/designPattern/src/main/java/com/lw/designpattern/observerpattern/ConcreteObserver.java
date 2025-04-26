package com.lw.designpattern.observerpattern;

/**
 * 具体观察者
 * @author lw
 * @create 2025-04-26-12:03
 */
public class ConcreteObserver implements Observer {

    private String name;

    public ConcreteObserver(String name) {
        this.name = name;
    }

    @Override
    public void update(String state) {
        System.out.println(name + " received update: " + state);
    }
}
