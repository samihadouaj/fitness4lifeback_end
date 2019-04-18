package com.grokonez.jwtauthentication.controller;

import com.grokonez.jwtauthentication.model.Aliment;
import com.grokonez.jwtauthentication.security.services.AlimentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class AlimentController {
    @Autowired
    private AlimentService alimentsService;
    @RequestMapping("/Aliment/get")
    public List<Aliment> getAllAliments(){
       return alimentsService.getAllAliments();
    }

    @RequestMapping("/Aliment/reg/{reg}")
    public List<Aliment> getAlimentByRegex(@PathVariable String reg){
        return alimentsService.getAlimentByRegex(reg);
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

    @RequestMapping("/Aliment/name/{name}")
    public List<Aliment> getAlimentByName(@PathVariable String name){
        return alimentsService.getAlimentByName(name);
    }

//
//    @RequestMapping("/Aliments/top10")
//    public List<Aliment> getTop10Aliments(){
//        return alimentsService.getTop10Aliment();
//    }

}
