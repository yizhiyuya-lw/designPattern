package com.lw.designpattern.observerpattern;

import java.util.ArrayList;
import java.util.List;

/**
 * 具体主题类
 * @author lw
 * @create 2025-04-26-12:00
 */
public class ConcreteSubject implements Subject {

    private String state;
    private List<Observer> observers = new ArrayList<>();

    // 改变状态，通知观察者
    @Override
    public void setState(String state) {
        this.state = state;
        notify(state);
    }

    @Override
    public void register(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void remove(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notify(String state) {
        for (Observer observer : observers) {
            observer.update(this.state);
        }
    }
}
