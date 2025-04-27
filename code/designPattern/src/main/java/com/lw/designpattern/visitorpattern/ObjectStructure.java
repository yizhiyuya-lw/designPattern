package com.lw.designpattern.visitorpattern;

import java.util.ArrayList;
import java.util.List;

/**
 * 访问者模式 -- 枚举元素
 * @author lw
 * @create 2025-04-27-21:43
 */
public class ObjectStructure {

    private List<Element> elementList = new ArrayList<>();

    public void add(Element element) {
        elementList.add(element);
    }

    public void remove(Element element) {
        elementList.remove(element);
    }

    public void accept(Visitor visitor) {
        for (Element element : elementList) {
            element.accept(visitor);
        }
    }
}
