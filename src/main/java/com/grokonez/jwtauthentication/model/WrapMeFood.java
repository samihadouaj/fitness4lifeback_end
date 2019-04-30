package com.grokonez.jwtauthentication.model;

import java.util.List;

public class WrapMeFood {
    private List<FoodPlusQty> listOfMekla;
    private int calsIn;

    public void setCalsIn(int calsIn) {
        this.calsIn = calsIn;
    }

    public int getCalsIn() {
        return calsIn;
    }

    public List<FoodPlusQty> getListOfMekla() {
        return listOfMekla;
    }

    public WrapMeFood(List<FoodPlusQty> listOfMekla) {
        this.listOfMekla = listOfMekla;
    }

    public void setListOfMekla(List<FoodPlusQty> listOfMekla) {
        this.listOfMekla = listOfMekla;
    }


    public WrapMeFood() {
    }
}
