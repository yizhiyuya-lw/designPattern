package com.lw.designpattern.observerpattern;

/**
 * @author lw
 * @create 2025-04-26-12:04
 */
public class DemoTest {

    public static void main(String[] args) {
        Subject subject = new ConcreteSubject();
        Observer o1 = new ConcreteObserver("observerA");
        Observer o2 = new ConcreteObserver("observerB");

        subject.register(o1);
        subject.register(o2);

        subject.setState("state A");
        subject.setState("state B");

        subject.remove(o1);
        subject.setState("state C");
    }
}
