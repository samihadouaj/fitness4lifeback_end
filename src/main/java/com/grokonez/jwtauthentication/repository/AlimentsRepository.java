package com.grokonez.jwtauthentication.repository;

import com.grokonez.jwtauthentication.model.Aliment;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface AlimentsRepository extends MongoRepository<Aliment,String> {

    Optional<Aliment> findById(String id);
    List<Aliment> findAll();
    Aliment findByName(String name);
}
