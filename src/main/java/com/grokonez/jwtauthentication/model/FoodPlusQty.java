package com.grokonez.jwtauthentication.model;

public class FoodPlusQty {
    private String food_id;
    private int qty;

    public FoodPlusQty(String food_id, int qty) {
        this.food_id = food_id;
        this.qty = qty;
    }

    public String getFood_id() {
        return food_id;
    }

    public int getQty() {
        return qty;
    }

    public void setFood_id(String food_id) {
        this.food_id = food_id;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }
}
