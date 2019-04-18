package com.grokonez.jwtauthentication.controller;

import com.grokonez.jwtauthentication.model.Workout;
import com.grokonez.jwtauthentication.security.services.WorkoutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class WorkoutController {

    @Autowired
    private WorkoutService workoutService; //Business service

    @RequestMapping("/workouts")
    public List<Workout> getAllWorkouts(){
        return workoutService.getAllWorkouts();
    }

    @RequestMapping("/workout/{id}")
    public Workout getWorkout(@PathVariable String id){
        return workoutService.getWorkout(id);
    }

    @PostMapping(value = "/workouts/add")
    public void addWorkout(@RequestBody Workout workout){
        workoutService.addWorkout(workout);
    }

    @PutMapping(value = "/workouts")
    public void updateWorkout(@RequestBody Workout workout){
        workoutService.updateWorkout(workout);
    }

    @DeleteMapping(value = "/workouts/{id}")
    public void deleteWorkout(@PathVariable String id){
        workoutService.deleteWorkout(id);
    }
}

