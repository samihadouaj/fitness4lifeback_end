package com.grokonez.jwtauthentication.model;

public class ActivityPlusQty {
    private String activity_id;
    private int qty;

    public ActivityPlusQty(String activity_id, int qty) {
        this.activity_id = activity_id;
        this.qty = qty;
    }

    public String getActivity_id() {
        return activity_id;
    }

    public int getQty() {
        return qty;
    }

    public void setActivity_id(String activity_id) {
        this.activity_id = activity_id;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }
}
