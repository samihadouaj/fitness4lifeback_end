package com.grokonez.jwtauthentication.security.services;

import com.grokonez.jwtauthentication.model.User;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;

public class UserPrinciple implements UserDetails {
	private static final long serialVersionUID = 1L;

    private String id;
    private String firstName;
    private String lastName;
    private String username;
    private String gender;
    private int age;
    private int current_weight;
    private float height;
    private int target_weight;
    private String activity_lvl;
    private String diet_pace;
    private int imc;
    private int calories_needed;
    private String email;
    private String password;
    private List<Integer> balance;
    private Collection<? extends GrantedAuthority> authorities;

    public UserPrinciple(String id, String firstName, String lastName, String username, String gender, int age, int current_weight, float height, int target_weight, String activity_lvl, String diet_pace, int imc, int calories_needed, String email, String password, List<Integer> balance , Collection<? extends GrantedAuthority> authorities) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.gender = gender;
        this.age = age;
        this.current_weight = current_weight;
        this.height = height;
        this.target_weight = target_weight;
        this.activity_lvl = activity_lvl;
        this.diet_pace = diet_pace;
        this.imc = imc;
        this.calories_needed = calories_needed;
        this.email = email;
        this.password = password;
        this.balance = balance;
        this.authorities = authorities;
    }

    public static UserPrinciple build(User user) {
        List<GrantedAuthority> authorities =  new ArrayList<>();
        authorities.add((new SimpleGrantedAuthority("ROLE_USER")));

        return new UserPrinciple(
                user.getId(),
                user.getFirstName(),
                user.getLastName(),
                user.getUsername(),
                user.getGender(),
                user.getAge(),
                user.getCurrent_weight(),
                user.getHeight(),
                user.getTarget_weight(),
                user.getActivity_lvl(),
                user.getDiet_pace(),
                user.getImc(),
                user.getCalories_needed(),
                user.getEmail(),
                user.getPassword(),
                user.getBalance(),
                authorities
        );
    }

    public String getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public int getCurrent_weight() {
        return current_weight;
    }

    public float getHeight() {
        return height;
    }

    public int getTarget_weight() {
        return target_weight;
    }

    public String getActivity_lvl() {
        return activity_lvl;
    }

    public String getDiet_pace() {
        return diet_pace;
    }

    public int getImc() {
        return imc;
    }

    public int getCalories_needed() {
        return calories_needed;
    }

    public List<Integer> getBalance() {
        return balance;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authorities;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        
        UserPrinciple user = (UserPrinciple) o;
        return Objects.equals(id, user.id);
    }
}