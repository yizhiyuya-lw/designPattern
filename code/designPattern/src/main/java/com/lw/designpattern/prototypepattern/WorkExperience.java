package com.lw.designpattern.prototypepattern;

/**
 * @author lw
 * @create 2025-04-24-22:17
 */
public class WorkExperience implements Cloneable {

    private String workDate;
    private String company;

    public WorkExperience() {
    }

    public WorkExperience(String workDate, String company) {
        this.workDate = workDate;
        this.company = company;
    }

    public String getWorkDate() {
        return workDate;
    }

    public void setWorkDate(String workDate) {
        this.workDate = workDate;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public WorkExperience clone() {
        try {
            return (WorkExperience) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
