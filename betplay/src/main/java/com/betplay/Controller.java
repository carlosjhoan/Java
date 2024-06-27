package com.betplay;

import java.util.Hashtable;

import com.betplay.model.entity.Team;

public class Controller {
    public final Hashtable<String, Team> controller;

    private static  Controller INSTANCE = new Controller(); 

   

    private Controller() {
       controller = new Hashtable<String, Team>();

    }

    public static Controller getController() {
        return INSTANCE;
    }
    
}
