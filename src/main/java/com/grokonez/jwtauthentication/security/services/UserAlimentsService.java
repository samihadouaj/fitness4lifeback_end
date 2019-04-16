package com.grokonez.jwtauthentication.security.services;

import com.grokonez.jwtauthentication.model.Aliment;
import com.grokonez.jwtauthentication.repository.UserAliments;
import com.grokonez.jwtauthentication.repository.AlimentsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserAlimentsService { //to add user aliments

        @Autowired
        private UserAliments userAliments;
        @Autowired
        private AlimentsRepository alimentsRepository;



        public  List<Aliment> getAllAliments(){
            List<Aliment> ar= new ArrayList<>();
            userAliments.findAll().forEach(ar::add);
            return ar;
        }


        public Aliment getAlimentById(String id){
            return userAliments.findById(id).get();
        }

        public Aliment getAlimentByName(String name){
            return userAliments.findByName(name);
        }

       public void addAliment(String name,double qty){

           //getting the id
           Aliment a;
           a=alimentsRepository.findByName(name);
           a.setQty(qty);

           //saving to the repository
           userAliments.save(a);
        }

        public void deleteAlimentbyName(String name){
            userAliments.deleteAlimentByName(name);
        }

        public void deleteAlimentById(String id){
            userAliments.deleteAlimentById(id);
        }


}
