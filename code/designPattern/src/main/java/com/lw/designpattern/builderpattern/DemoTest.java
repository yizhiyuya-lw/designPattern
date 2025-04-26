package com.lw.designpattern.builderpattern;

/**
 * @author lw
 * @create 2025-04-26-9:50
 */
public class DemoTest {

    public static void main(String[] args) {
        Director director = new Director();
        Builder builder = new ConcreteBuilderA();
        director.construct(builder);
        Product product = builder.getResult();
        product.show();
    }
}
