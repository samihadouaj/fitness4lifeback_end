package com.grokonez.jwtauthentication.repository;

import com.grokonez.jwtauthentication.model.Workout;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface WorkoutRepository extends MongoRepository<Workout,Integer> {
    Workout findById(String id);
    void deleteById(String id);

    Workout findByName(String name);
}
