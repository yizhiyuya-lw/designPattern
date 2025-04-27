package com.lw.designpattern.iteratorpattern;

/**
 * @author lw
 * @create 2025-04-27-10:55
 */
public class DemoTest {

    public static void main(String[] args) {
        SimpleCollection<String> coll = new SimpleCollection<>(16);

        coll.add("aaa");
        coll.add("bbb");
        coll.add("ccc");
        coll.add("ddd");
        coll.add("eee");

        while (coll.hasNext()) {
            System.out.println(coll.next());
        }
    }
}
