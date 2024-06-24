package com.betplay.model.entity;

public class Doctor extends Person{
    private String degree;
    private int expYear;

    public Doctor(){
        super();
    }
    
    public Doctor(String degree, int expYear) {
        this.degree = degree;
        this.expYear = expYear;
    }
    public Doctor(int id, String firstName, String lastName, int age, String degree, int expYear) {
        super(id, firstName, lastName, age);
        this.degree = degree;
        this.expYear = expYear;
    }
    public String getDegree() {
        return degree;
    }
    public void setDegree(String degree) {
        this.degree = degree;
    }
    public int getExpYear() {
        return expYear;
    }
    public void setExpYear(int expYear) {
        this.expYear = expYear;
    }

}
