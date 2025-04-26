package com.lw.designpattern.mementopattern;

/**
 * 备忘录模式-- Memento 备忘录
 * @author lw
 * @create 2025-04-26-22:24
 */
public class RoleStateMemento {

    private int vit;

    private int atk;

    private int def;

    public RoleStateMemento(int vit, int atk, int def) {
        this.vit = vit;
        this.atk = atk;
        this.def = def;
    }

    public int getVit() {
        return vit;
    }

    public void setVit(int vit) {
        this.vit = vit;
    }

    public int getAtk() {
        return atk;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }
}
