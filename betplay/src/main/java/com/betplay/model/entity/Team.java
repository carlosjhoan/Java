package com.betplay.model.entity;

import java.util.ArrayList;
import java.util.List;

public class Team {
    public int Id;
    public String name;
    public String city;
    public List<Player> listPlayers;
    public List<Coach> listCoaches;
    public List<Doctor> listDoctors;

    public Team() {
        listPlayers = new ArrayList<Player>();
        listCoaches = new ArrayList<Coach>();
        listDoctors = new ArrayList<Doctor>();
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public List<Player> getListPlayers() {
        return listPlayers;
    }

    public void setListPlayers(List<Player> listPlayers) {
        this.listPlayers = listPlayers;
    }

    public List<Coach> getListCoaches() {
        return listCoaches;
    }

    public void setListCoaches(List<Coach> listCoaches) {
        this.listCoaches = listCoaches;
    }

    public List<Doctor> getListDoctors() {
        return listDoctors;
    }

    public void setListDoctors(List<Doctor> listDoctors) {
        this.listDoctors = listDoctors;
    }

    
    
}
