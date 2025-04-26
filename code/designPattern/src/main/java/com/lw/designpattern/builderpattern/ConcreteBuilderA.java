package com.lw.designpattern.builderpattern;

/**
 * 建造者模式--具体建造者
 * @author lw
 * @create 2025-04-26-9:46
 */
public class ConcreteBuilderA extends Builder {

    private Product product = new Product();

    @Override
    public void buildPartA(String partA) {
        product.addPart(partA);
    }

    @Override
    public void buildPartB(String partB) {
        product.addPart(partB);
    }

    @Override
    public Product getResult() {
        return product;
    }
}
