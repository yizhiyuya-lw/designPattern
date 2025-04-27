package com.lw.designpattern.visitorpattern;

/**
 * @author lw
 * @create 2025-04-27-21:44
 */
public class DemoTest {

    public static void main(String[] args) {
        ObjectStructure objectStructure = new ObjectStructure();
        objectStructure.add(new ElementA());
        objectStructure.add(new ElementB());

        ConcreteVisitor visitor = new ConcreteVisitor();

        objectStructure.accept(visitor);
    }
}
