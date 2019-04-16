package com.grokonez.jwtauthentication.security.services;


import com.grokonez.jwtauthentication.model.Aliment;
import com.grokonez.jwtauthentication.repository.AlimentsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AlimentService { // to fetch all existing aliments in DB

    @Autowired
    private AlimentsRepository alimentsRepository;


    public void addAliments(Aliment a){
        alimentsRepository.save(a);
    }

    public List<Aliment> getAllAliments(){
        List<Aliment> ar= new ArrayList<>();
        alimentsRepository.findAll().forEach(ar::add);
        return ar;
    }


    public  Aliment getAlimentById(String id){
        return alimentsRepository.findById(id).get();
    }


    public Aliment getAlimentByName(String name){
        return alimentsRepository.findByName(name);
    }




}
