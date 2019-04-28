package com.grokonez.jwtauthentication.security.services;

import com.grokonez.jwtauthentication.model.DayAssesment;
import com.grokonez.jwtauthentication.model.FoodPlusQty;
import com.grokonez.jwtauthentication.model.User;
import com.grokonez.jwtauthentication.model.WrapMe;
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

    public void updateMekla(WrapMe mekla, String id) {
        DayAssesment day = this.getAssesment(id);
        day.setMekla(mekla.getListOfMekla());
        this.dayAssesmentRepo.save(day);
    }


}
