package com.grokonez.jwtauthentication.model;

import java.util.List;

public class WrapMe {
    private List<FoodPlusQty> listOfMekla;


    public List<FoodPlusQty> getListOfMekla() {
        return listOfMekla;
    }

    public WrapMe(List<FoodPlusQty> listOfMekla) {
        this.listOfMekla = listOfMekla;
    }

    public void setListOfMekla(List<FoodPlusQty> listOfMekla) {
        this.listOfMekla = listOfMekla;
    }


    public WrapMe() {
    }
}
