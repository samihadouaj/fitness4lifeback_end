package com.grokonez.jwtauthentication.model;


import org.springframework.data.annotation.Id;

public class Aliment {

    @Id
    private String id;

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    private String name;
    private int lipides,glucides,proteines;
    private double qty;
    private int cals;

    public void setCals(int cals) {
        this.cals = cals;
    }

    public int getCals() {
        return cals;
    }

    public Aliment(){

    }

    public Aliment(String name, int lipides, int glucides, int proteines, double qty) {
        this.name = name;
        this.lipides = lipides;
        this.glucides = glucides;
        this.proteines = proteines;
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public double getQty() {
        return qty;
    }

    public void setQty(double qty) {
        this.qty = qty;
    }

    public int getLipides() {
        return lipides;
    }

    public void setLipides(int lipides) {
        this.lipides = lipides;
    }

    public int getGlucides() {
        return glucides;
    }

    public void setGlucides(int glucides) {
        this.glucides = glucides;
    }

    public int getProteines() {
        return proteines;
    }

    public void setProteines(int proteines) {
        this.proteines = proteines;
    }

    @Override
    public String toString() {
        return "Aliment{" +
                ", name='" + name + '\'' +
                ", lipides=" + lipides +
                ", glucides=" + glucides +
                ", proteines=" + proteines +
                ", qty=" + qty +
                '}';
    }
}
