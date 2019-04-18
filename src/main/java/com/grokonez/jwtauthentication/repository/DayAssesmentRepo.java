package com.grokonez.jwtauthentication.repository;

import com.grokonez.jwtauthentication.model.DayAssesment;
import com.grokonez.jwtauthentication.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.Repository;

import java.util.Optional;

public interface DayAssesmentRepo extends MongoRepository<DayAssesment, String> {
    public Optional<DayAssesment> findByUid(String userId);
    public void deleteByUid(String userId);
}
