package com.grokonez.jwtauthentication.controller;

import com.grokonez.jwtauthentication.model.DayAssesment;
import com.grokonez.jwtauthentication.model.FoodPlusQty;
import com.grokonez.jwtauthentication.model.WrapMe;
import com.grokonez.jwtauthentication.security.services.DayAssesmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
    public List<FoodPlusQty> getFoods(@PathVariable String id){
        return this.dayAssesmentService.getFoods(id);
    }

    @DeleteMapping("delete/{id}")
    public void deleteAsss(@PathVariable String id) {
             this.dayAssesmentService.deleteAss(id);
    }
    @PostMapping("/addMekla/{id}")
    public void updateMekla(@PathVariable String id , @RequestBody WrapMe mekla){
            System.out.println("Inside the addMekla:");
            System.out.println(id);

        this.dayAssesmentService.updateMekla(mekla,id);
            System.out.println("kamelna the addMekla:");

    }
}
