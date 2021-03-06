package com.grokonez.jwtauthentication.security.services;

import com.grokonez.jwtauthentication.model.Aliment;
import com.grokonez.jwtauthentication.model.Workout;

import com.grokonez.jwtauthentication.repository.WorkoutRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class WorkoutService {
        @Autowired
        private WorkoutRepository workoutRepository;

   /* private List<Workout> Workouts = new ArrayList<Workout>(Arrays.asList(
            new Workout("a","b","c"),
                new Workout("e","f","g"),
                new Workout("h","i","j")
        ));*/

        public List<Workout> getAllWorkouts(){
            List<Workout> Workouts = new ArrayList<>();
            workoutRepository.findAll().forEach(Workouts::add);
            return Workouts;
        }

        public Workout getWorkout(String id){
            Workout t =  workoutRepository.findById(id);
            return t;
        }

        public Workout getWorkoutByName(String name){
            Workout t = workoutRepository.findByName(name);
            return t;
        }

        public void addWorkout(Workout workout){
            this.workoutRepository.save(workout);
        }

        public void updateWorkout(Workout workout){
            this.workoutRepository.save(workout);
        }

        public void deleteWorkout(String id){
            this.workoutRepository.deleteById(id);
        }


    public List<Workout> getWorkoutByRegex(String reg) {

        List<Workout> l = this.workoutRepository.findAll();
        List<Workout> r = new ArrayList<Workout>();
        for(Workout  w :l ) {
            System.out.println(w.getName());

            if(w.getName().startsWith(reg))
                r.add(w);
            System.out.println(w.getName());
        }
        return  r;
    }
}

