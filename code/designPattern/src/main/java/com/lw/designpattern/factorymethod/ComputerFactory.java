package com.lw.designpattern.factorymethod;

/**
 * @author lw
 * @create 2025-04-24-21:36
 */
public class ComputerFactory implements Factory {
    @Override
    public Product createProduct() {
        return new ComputerProduct();
    }
}
