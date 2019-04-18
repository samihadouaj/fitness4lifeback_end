package com.grokonez.jwtauthentication.security.services;

import com.grokonez.jwtauthentication.model.DayAssesment;
import com.grokonez.jwtauthentication.model.FoodPlusQty;
import com.grokonez.jwtauthentication.model.User;
import com.grokonez.jwtauthentication.repository.DayAssesmentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class DayAssesmentService {
    @Autowired
    private DayAssesmentRepo dayAssesmentRepo;

    public DayAssesment getAssesment(String userId) {
            return this.dayAssesmentRepo.findByUid(userId).get();
    }
    public FoodPlusQty[] getFoods(String userId) {
          return this.getAssesment(userId).getMekla();
    }

    public void addAss(DayAssesment dayAssesment) {
        this.dayAssesmentRepo.save(dayAssesment);
    }

    public void deleteAss(String id) {
        this.dayAssesmentRepo.deleteByUid(id);
    }

}
