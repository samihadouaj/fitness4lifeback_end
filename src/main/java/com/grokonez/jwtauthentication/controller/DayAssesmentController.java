package com.grokonez.jwtauthentication.controller;

import com.grokonez.jwtauthentication.model.DayAssesment;
import com.grokonez.jwtauthentication.model.FoodPlusQty;
import com.grokonez.jwtauthentication.security.services.DayAssesmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/assesment")
public class DayAssesmentController {
    @Autowired
        private DayAssesmentService dayAssesmentService;
        @PostMapping("/add")
            public void addAss(@RequestBody DayAssesment dayAssesment) {
            this.dayAssesmentService.addAss(dayAssesment);
        }

        @GetMapping("get/{id}")
        public DayAssesment getAssByUserId(@PathVariable String id){
            return this.dayAssesmentService.getAssesment(id);
        }

    @GetMapping("getFoods/{id}")
    public FoodPlusQty[] getFoods(@PathVariable String id){
        return this.dayAssesmentService.getFoods(id);
    }

    @DeleteMapping("delete/{id}")
    public void deleteAsss(@PathVariable String id) {
             this.dayAssesmentService.deleteAss(id);
    }
}
