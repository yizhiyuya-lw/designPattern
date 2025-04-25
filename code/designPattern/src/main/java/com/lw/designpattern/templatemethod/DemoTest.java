package com.lw.designpattern.templatemethod;

/**
 * @author lw
 * @create 2025-04-25-21:42
 */
public class DemoTest {

    public static void main(String[] args) {
        Question question = new AnswerOne();
        question.dealQuestion();
    }
}
