package com.lw.designpattern.prototypepattern;

/**
 * @author lw
 * @create 2025-04-24-22:26
 */
public class DemoTest {

    public static void main(String[] args) {
        Resume a = new Resume("大鸟");
        a.setPersonalInfo("男", "29");
        a.setWorkExperience("1998-2000", "xx公司");

        a.display();

        Resume b = a.clone();
        b.setWorkExperience("1998-2006", "yy企业");

        b.display();

        Resume c = a.clone();
        c.setWorkExperience("1998-2003", "zz企业");
        c.display();
    }
}
