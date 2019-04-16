package com.grokonez.jwtauthentication.controller;

import com.grokonez.jwtauthentication.model.Aliment;
import com.grokonez.jwtauthentication.security.services.UserAlimentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserAlimentsController {

    @Autowired
    UserAlimentsService userAlimentsService;

    @RequestMapping("/UserAliments")
    public List<Aliment> getAllAliments() {
        return userAlimentsService.getAllAliments();
    }


    @RequestMapping("/UserAliments/id/{id}")
    public Aliment getAlimentById(@PathVariable String id) {
        return userAlimentsService.getAlimentById(id);
    }


    @RequestMapping("/UserAliments/name/{name}")
    public Aliment getAlimentByName(@PathVariable String name) {
        return userAlimentsService.getAlimentByName(name);
    }

    @RequestMapping(value = "/UserAliments/{name}/{qty}",method = RequestMethod.POST)
    public void addAliment(@PathVariable String name, @PathVariable String qty) {
        userAlimentsService.addAliment(name,Double.parseDouble(qty));
    }

    @RequestMapping(value ="/UserAliments/name/{name}",method = RequestMethod.DELETE)
    public void deleteAlimentbyName(@PathVariable String name) {
        userAlimentsService.deleteAlimentbyName(name);
    }

    @RequestMapping(value ="/UserAliments/id/{id}",method=RequestMethod.DELETE)
    public void deleteAlimentById(@PathVariable String id) {
        userAlimentsService.deleteAlimentById(id);
    }
}
