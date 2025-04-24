package com.lw.designpattern.proxypattern;

/**
 * 代理模式
 * @author lw
 * @create 2025-04-24-21:10
 */
public class Proxy implements Subject {

    private RealSubject realSubject;

    public Proxy(RealSubject realSubject) {
        this.realSubject = realSubject;
    }

    @Override
    public void request() {
        System.out.println("proxy, executing realSubject");
        realSubject.request();
    }
}
