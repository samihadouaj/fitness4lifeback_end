package com.grokonez.jwtauthentication.model;

import org.springframework.data.annotation.Id;


public class Workout {

    @Id
    private String id;
    private String name;
    private String type;
    private int kcal;
    private float qty;

    public Workout(String id, String name, String type, int kcal, float qty) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.kcal = kcal;
        this.qty = qty;
    }

    public float getQty() {
        return qty;
    }

    public void setQty(float qty) {
        this.qty = qty;
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
