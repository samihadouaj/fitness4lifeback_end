package com.grokonez.jwtauthentication.security.services;

import com.grokonez.jwtauthentication.model.User;
import com.grokonez.jwtauthentication.repository.UserRepo;
import com.grokonez.jwtauthentication.security.jwt.JwtProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class UserService {
    @Autowired
    private JwtProvider jwtProvider;
    @Autowired
    UserRepo userRepo;

    public User getUserByUsername(String username){
       return this.userRepo.findByUsername(username).get();
    }

    public void updateUser(User user ,String id) {
        System.out.println(id);
        System.out.println(user);
        User u = this.userRepo.findById(id).get();
        u.setLastName(user.getLastName());
        u.setFirstName(user.getFirstName());
        u.setUsername(user.getUsername());
        u.setActivity_lvl(user.getActivity_lvl());
        u.setAge(user.getAge());
        u.setCalories_needed(user.getCalories_needed());
        u.setEmail(user.getEmail());
        u.setCurrent_weight(user.getCurrent_weight());
        u.setTarget_weight(user.getTarget_weight());
        u.setDiet_pace(user.getDiet_pace());
        u.setHigh(user.getHigh());
        u.setBalance(user.getBalance());
        this.userRepo.save(u);
    }

}


