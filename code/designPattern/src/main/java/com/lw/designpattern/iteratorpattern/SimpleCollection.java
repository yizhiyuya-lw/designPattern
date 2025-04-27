package com.lw.designpattern.iteratorpattern;

import java.util.Iterator;

/**
 * 迭代器模式--简单集合类
 * @author lw
 * @create 2025-04-27-10:41
 */
public class SimpleCollection<T> implements Iterator<T> {

    private Object[] dataArr;
    private int length;
    private int size;

    // 迭代器下标
    private int index = 0;

    public SimpleCollection(int length) {
        if (length < 0 || length > 1024) {
            throw new IllegalArgumentException("length must in (0, 1024)");
        }

        this.length = length;
        this.dataArr = new Object[length];
        this.size = 0;
    }

    public void add(T t) {

        // size表示当前数组下标
        if (size >= length) {
            throw new RuntimeException("coll is full");
        }

        dataArr[size++] = t;
    }

    @Override
    public boolean hasNext() {
        return index < size;
    }

    @Override
    public T next() {
        T result = null;
        result = (T) dataArr[index++];
        return result;
    }
}
