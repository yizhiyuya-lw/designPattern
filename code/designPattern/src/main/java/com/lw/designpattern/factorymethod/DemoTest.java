package com.lw.designpattern.factorymethod;

/**
 * @author lw
 * @create 2025-04-24-21:37
 */
public class DemoTest {

    public static void main(String[] args) {

        ComputerFactory computerFactory = new ComputerFactory();
        Product computerProduct = computerFactory.createProduct();
        computerProduct.show();

        PhoneFactory phoneFactory = new PhoneFactory();
        Product phoneProduct = phoneFactory.createProduct();
        phoneProduct.show();
    }
}
