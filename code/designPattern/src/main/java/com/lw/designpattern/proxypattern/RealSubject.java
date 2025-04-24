package com.lw.designpattern.proxypattern;

/**
 * @author lw
 * @create 2025-04-24-21:10
 */
public class RealSubject implements Subject {
    @Override
    public void request() {
        System.out.println("realSubject");
    }
}
