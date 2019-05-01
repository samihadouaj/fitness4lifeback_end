package com.grokonez.jwtauthentication.controller;

import com.grokonez.jwtauthentication.model.DayAssesment;
import com.grokonez.jwtauthentication.model.FoodPlusQty;
import com.grokonez.jwtauthentication.model.WrapMeActivity;
import com.grokonez.jwtauthentication.model.WrapMeFood;
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
    public void updateMekla(@PathVariable String id , @RequestBody WrapMeFood mekla){
            System.out.println("Inside the addMekla:");
        this.dayAssesmentService.updateMekla(mekla,id);
        this.dayAssesmentService.updateCalsIn(mekla.getCalsIn(),id);
        System.out.println("kamelna the addMekla:");

    }

    @PostMapping("/addWorkout/{id}")
    public void updateActivity(@PathVariable String id , @RequestBody WrapMeActivity activity){
        System.out.println("Inside the addActivity:");
        this.dayAssesmentService.updateActivity(activity,id);
        this.dayAssesmentService.updateCalsOut(activity.getCalsOut(),id);
        System.out.println("kamelna the addActivity:");
    }
    @GetMapping("/exists/{id}")
    public boolean dayAssesmentExists(@PathVariable String id) {
            return this.dayAssesmentService.dayAssesmentExists(id);
    }

    @PostMapping("/finishDay/{id}")
    public void finishDay(@PathVariable String id, @RequestBody int balance) {
            this.dayAssesmentService.finishDay(balance,id);
    }
}
