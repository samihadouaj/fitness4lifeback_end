package com.grokonez.jwtauthentication.controller;

import com.grokonez.jwtauthentication.model.Aliment;
import com.grokonez.jwtauthentication.security.services.AlimentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AlimentController {
    @Autowired
    private AlimentService alimentsService;
    @RequestMapping("/Aliments")
    public List<Aliment> getAllAliments(){
       return alimentsService.getAllAliments();
    }


    @RequestMapping(method=RequestMethod.POST,value = "/Aliment/add")
    public  void addAliments(@RequestBody Aliment a){
        //Adding aliments for test
            alimentsService.addAliments(a);
        }

    @RequestMapping("/Aliment/{id}")
    public Aliment getAlimentById(@PathVariable String id){
        return alimentsService.getAlimentById(id);
    }

    @RequestMapping("/Aliment/{name}")
    public Aliment getAlimentByName(@PathVariable String name){
        return alimentsService.getAlimentByName(name);
    }

}
