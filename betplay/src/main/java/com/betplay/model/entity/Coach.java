package com.betplay.model.entity;

public class Coach extends Person{
    private int idFederation;

    public Coach(){
        super();
    }
    
    public Coach(int idFederation) {
        this.idFederation = idFederation;
    }
    public Coach(int id, String firstName, String lastName, int age, int idFederation) {
        super(id, firstName, lastName, age);
        this.idFederation = idFederation;
    }
   
    public int getIdFederation() {
        return idFederation;
    }
    public void setIdFederation(int idFederation) {
        this.idFederation = idFederation;
    }
}
