package com.lw.designpattern.prototypepattern;

/**
 * @author lw
 * @create 2025-04-24-22:18
 */
public class Resume implements Cloneable {

    private String name;
    private String sex;
    private String age;
    private WorkExperience work;

    public Resume(String name) {
        this.name = name;
        this.work = new WorkExperience();
    }

    public Resume(WorkExperience work) {
        this.work = work.clone();
    }

    public void setPersonalInfo(String sex, String age) {
        this.sex = sex;
        this.age = age;
    }

    public void setWorkExperience(String workDate, String company) {
        this.work.setWorkDate(workDate);
        this.work.setCompany(company);
    }

    public void display() {
        System.out.println(name + " " + sex + " " + age);
        System.out.println("工作经历: " + work.getWorkDate() + " " + work.getCompany());
    }

    @Override
    public Resume clone() {
        // 深拷贝
        Resume obj = new Resume(this.work);
        obj.name = this.name;
        obj.sex = this.sex;
        obj.age = this.age;
        return obj;
    }
}
