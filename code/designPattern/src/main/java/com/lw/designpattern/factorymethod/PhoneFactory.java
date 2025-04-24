package com.lw.designpattern.factorymethod;

/**
 * @author lw
 * @create 2025-04-24-21:37
 */
public class PhoneFactory implements Factory {
    @Override
    public Product createProduct() {
        return new PhoneProduct();
    }
}
