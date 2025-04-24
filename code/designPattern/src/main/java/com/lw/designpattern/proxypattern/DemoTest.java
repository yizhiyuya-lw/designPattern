package com.lw.designpattern.proxypattern;

/**
 * @author lw
 * @create 2025-04-24-21:11
 */
public class DemoTest {

    public static void main(String[] args) {
        Proxy proxy = new Proxy(new RealSubject());

        proxy.request();
    }
}
