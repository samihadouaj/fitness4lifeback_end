package com.grokonez.jwtauthentication.model;

import org.springframework.data.annotation.Id;

public class DayAssesment {
    @Id
    private String id;
    private String uid;
    private FoodPlusQty[] mekla;
    private float totalCalIn;
    private float calBurned;
    private ActivityPlusQty[] activities;

    public DayAssesment(String user_id, FoodPlusQty[] mekla, float totalCalIn, float calBurned, ActivityPlusQty[] activities) {
        this.uid = user_id;
        this.mekla = mekla;
        this.totalCalIn = totalCalIn;
        this.calBurned = calBurned;
        this.activities = activities;
    }

    public String getId() {
        return id;
    }

    public String getUuidid() {
        return uid;
    }

    public FoodPlusQty[] getMekla() {
        return mekla;
    }

    public float getTotalCalIn() {
        return totalCalIn;
    }

    public float getCalBurned() {
        return calBurned;
    }

    public ActivityPlusQty[] getActivities() {
        return activities;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setUid(String user_id) {
        this.uid = user_id;
    }

    public void setMekla(FoodPlusQty[] mekla) {
        this.mekla = mekla;
    }

    public void setTotalCalIn(float totalCalIn) {
        this.totalCalIn = totalCalIn;
    }

    public void setCalBurned(float calBurned) {
        this.calBurned = calBurned;
    }

    public void setActivities(ActivityPlusQty[] activities) {
        this.activities = activities;
    }
}
