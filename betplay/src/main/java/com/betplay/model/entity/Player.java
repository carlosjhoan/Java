package com.betplay.model.entity;


public class Player  extends Person{

    private int dorsal;
    private String position;

    public Player() {
        super();
    }
    public Player(int dorsal, String position) {
        this.dorsal = dorsal;
        this.position = position;
    }
    public Player(int id, String firstName, String lastName, int age, int dorsal, String position) {
        super(id, firstName, lastName, age);
        this.dorsal = dorsal;
        this.position = position;
    }
    public int getDorsal() {
        return dorsal;
    }
    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }
    public String getPosition() {
        return position;
    }
    public void setPosition(String position) {
        this.position = position;
    }
}
