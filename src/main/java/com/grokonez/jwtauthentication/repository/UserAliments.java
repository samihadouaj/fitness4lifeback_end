package com.grokonez.jwtauthentication.repository;

import com.grokonez.jwtauthentication.model.Aliment;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface  UserAliments extends CrudRepository<Aliment,String> {

    List<Aliment> findAll();
    Aliment findByName(String name);
    void deleteAlimentById(String id);
    void deleteAlimentByName(String Name);

}
