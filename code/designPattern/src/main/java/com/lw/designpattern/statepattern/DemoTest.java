package com.lw.designpattern.statepattern;

/**
 * @author lw
 * @create 2025-04-26-16:14
 */
public class DemoTest {

    public static void main(String[] args) {

        Work work = new Work();
        work.setHour(9);
        work.doHandle();

        work.setHour(10);
        work.doHandle();

        work.setHour(12);
        work.doHandle();

        work.setHour(13);
        work.doHandle();

        work.setHour(14);
        work.doHandle();

        work.setHour(17);
        // work.setFinish(true);
        work.setFinish(false);
        work.doHandle();

        work.setHour(19);
        work.doHandle();

        work.setHour(22);
        work.doHandle();
    }
}
