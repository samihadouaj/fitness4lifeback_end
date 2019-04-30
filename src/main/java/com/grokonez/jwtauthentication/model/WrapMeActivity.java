package com.grokonez.jwtauthentication.model;

import java.util.List;

public class WrapMeActivity {
    private List<ActivityPlusQty> listOfActivity;
    private int calsOut;

    public void setCalsOut(int calsOut) {
        this.calsOut = calsOut;
    }

    public int getCalsOut() {
        return calsOut;
    }

    public List<ActivityPlusQty> getListOfActivity() {
        return listOfActivity;
    }

    public WrapMeActivity(List<ActivityPlusQty> listOfActivity) {
        this.listOfActivity = listOfActivity;
    }

    public void setListOfMekla(List<ActivityPlusQty> listOfMekla) {
        this.listOfActivity = listOfActivity;
    }


    public WrapMeActivity() {
    }
}
