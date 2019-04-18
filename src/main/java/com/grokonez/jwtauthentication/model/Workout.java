package com.grokonez.jwtauthentication.model;

import org.springframework.data.annotation.Id;


public class Workout {

    @Id
    private String id;
    private String name;
    private String type;
    private int kcal;

    public Workout(String  id, String type, int kcal,String name) {
        this.name = name;
        this.id = id;
        this.type = type;
        this.kcal = kcal;

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getKcal() {
        return kcal;
    }

    public void setKcal(int kcal) {
        this.kcal = kcal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
