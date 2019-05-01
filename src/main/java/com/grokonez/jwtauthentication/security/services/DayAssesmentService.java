package com.grokonez.jwtauthentication.security.services;

import com.grokonez.jwtauthentication.model.*;
import com.grokonez.jwtauthentication.repository.DayAssesmentRepo;
import com.grokonez.jwtauthentication.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class DayAssesmentService {
    @Autowired
    private DayAssesmentRepo dayAssesmentRepo;
    @Autowired
    private UserRepo userRepo;

    public DayAssesment getAssesment(String uid) {
            return this.dayAssesmentRepo.findByUid(uid).get();
    }
    public List<FoodPlusQty> getFoods(String userId) {
          return this.getAssesment(userId).getMekla();
    }

    public void addAss(DayAssesment dayAssesment) {
        this.dayAssesmentRepo.save(dayAssesment);
    }

    public void deleteAss(String id) {
        this.dayAssesmentRepo.deleteByUid(id);
    }

    public void updateMekla(WrapMeFood mekla, String id) {
        DayAssesment day = this.getAssesment(id);
        day.setMekla(mekla.getListOfMekla());
        this.dayAssesmentRepo.save(day);
    }

    public void updateActivity(WrapMeActivity activity, String id) {
        DayAssesment day = this.getAssesment(id);
        day.setActivities(activity.getListOfActivity());
        this.dayAssesmentRepo.save(day);
    }

    public void updateCalsIn(int calsIn, String id) {
        DayAssesment day = this.getAssesment(id);
        day.setTotalCalIn(calsIn);
        this.dayAssesmentRepo.save(day);

    }

    public void updateCalsOut(int calsOut, String id) {
        DayAssesment day = this.getAssesment(id);
        day.setCalBurned(calsOut);
        this.dayAssesmentRepo.save(day);

    }

    public boolean dayAssesmentExists(String uid) {
        try {
            DayAssesment day = this.getAssesment(uid);
            return  true;
        }
        catch (Exception e) {
            return  false;
        }
    }

    public void finishDay(int balance,String uid) {
        User user = this.userRepo.findById(uid).get();
        List<Integer> userBalance = user.getBalance();
        userBalance.add(balance);
        this.userRepo.save(user);
        this.deleteAss(uid);
    }

}
