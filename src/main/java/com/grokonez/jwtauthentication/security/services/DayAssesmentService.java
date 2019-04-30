package com.grokonez.jwtauthentication.security.services;

import com.grokonez.jwtauthentication.model.DayAssesment;
import com.grokonez.jwtauthentication.model.FoodPlusQty;
import com.grokonez.jwtauthentication.model.WrapMeActivity;
import com.grokonez.jwtauthentication.model.WrapMeFood;
import com.grokonez.jwtauthentication.repository.DayAssesmentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class DayAssesmentService {
    @Autowired
    private DayAssesmentRepo dayAssesmentRepo;

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


}
