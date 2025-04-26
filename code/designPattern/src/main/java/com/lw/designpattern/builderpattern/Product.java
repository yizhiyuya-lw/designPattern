package com.lw.designpattern.builderpattern;

import java.util.ArrayList;
import java.util.List;

/**
 * 建造者模式--product
 * @author lw
 * @create 2025-04-26-9:43
 */
public class Product {

    List<String> parts = new ArrayList<>();

    public void addPart(String part) {
        parts.add(part);
    }

    public void show() {
        System.out.println("product: " + parts);
    }
}
