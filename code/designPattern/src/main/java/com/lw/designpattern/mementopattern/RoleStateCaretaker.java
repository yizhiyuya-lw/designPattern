package com.lw.designpattern.mementopattern;

/**
 * 备忘录模式 -- Caretaker 管理者
 * @author lw
 * @create 2025-04-26-22:25
 */
public class RoleStateCaretaker {

    private RoleStateMemento memento;

    public RoleStateMemento getMemento() {
        return memento;
    }

    public void setMemento(RoleStateMemento memento) {
        this.memento = memento;
    }
}
