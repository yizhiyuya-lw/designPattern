package com.lw.designpattern.mementopattern;

/**
 * 备忘录模式--Originator 发起人
 * @author lw
 * @create 2025-04-26-22:20
 */
public class GameRole {

    private int vit;
    private int atk;
    private int def;

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

    public void show() {
        System.out.println("角色当前状态:");
        System.out.println("体力：" + this.vit);
        System.out.println("攻击力：" + this.atk);
        System.out.println("防御力：" + this.def);
        System.out.println("----------------");
    }

    public void initState() {
        this.vit = 100;
        this.atk = 100;
        this.def = 100;
    }

    public void fight() {
        this.vit = 0;
        this.atk = 0;
        this.def = 0;
    }

    // 将状态保存至备忘录
    public RoleStateMemento createMemento() {
        return new RoleStateMemento(this.vit, this.atk, this.def);
    }

    // 恢复备忘录状态
    public void resetMemento(RoleStateMemento memento) {
        this.vit = memento.getVit();
        this.atk = memento.getAtk();
        this.def = memento.getDef();
    }
}
