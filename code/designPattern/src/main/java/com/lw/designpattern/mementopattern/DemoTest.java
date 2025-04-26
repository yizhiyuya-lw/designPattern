package com.lw.designpattern.mementopattern;

/**
 * @author lw
 * @create 2025-04-26-22:29
 */
public class DemoTest {

    public static void main(String[] args) {

        GameRole game = new GameRole();
        game.initState();
        game.show();

        // 创建用于保存Memento的管理者
        RoleStateCaretaker caretaker = new RoleStateCaretaker();
        System.out.println("状态改变");
        game.setVit(80);
        game.setAtk(80);
        game.setDef(80);
        game.show();

        // 存档
        caretaker.setMemento(game.createMemento());

        // 角色死亡
        game.fight();
        game.show();

        // 恢复存档
        game.resetMemento(caretaker.getMemento());
        game.show();
    }
}
