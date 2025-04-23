package com.lw.designpattern.decorator;

/**
 * 服饰类  对应 Decorator
 * @author lw
 * @create 2025-04-23-22:16
 */
public class Finery extends Person {

    protected Person person;

    public void setPerson(Person person) {
        this.person = person;
    }

    @Override
    public void show() {
        if (person != null) {
            person.show();
        }
    }
}
