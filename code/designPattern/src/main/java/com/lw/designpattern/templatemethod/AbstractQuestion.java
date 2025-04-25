package com.lw.designpattern.templatemethod;

/**
 * 问题模板方法
 * @author lw
 * @create 2025-04-25-21:40
 */
public abstract class AbstractQuestion implements Question {

    @Override
    public void dealQuestion() {
        System.out.println("this question: how....");
        printAnswer();
    }

    public abstract void printAnswer();
}
