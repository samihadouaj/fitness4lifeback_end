package com.grokonez.jwtauthentication.message.request;

import java.util.Set;

import javax.validation.constraints.*;

public class SignUpForm {
    @NotBlank
    @Size(min=3, max = 50)
    private String firstName;
    private String lastName;
    @NotBlank
    @Size(min=3, max = 50)
    private String username;
    private String gender;
    private int age;
    private int current_weight;
    private int high;
    private int target_weight;
    private String activity_lvl;
    private String diet_pace;
    private int imc;
    private int calories_needed;
    @NotBlank
    @Size(max = 50)
    @Email
    private String email;

    @NotBlank
    @Size(min=6, max = 100)
    private String password;

    private Set<String> role;



    public SignUpForm() {}




    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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

    public int getHigh() {
        return high;
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

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCurrent_weight(int current_weight) {
        this.current_weight = current_weight;
    }

    public void setHigh(int high) {
        this.high = high;
    }

    public void setTarget_weight(int target_weight) {
        this.target_weight = target_weight;
    }

    public void setActivity_lvl(String activity_lvl) {
        this.activity_lvl = activity_lvl;
    }

    public void setDiet_pace(String diet_pace) {
        this.diet_pace = diet_pace;
    }

    public void setImc(int imc) {
        this.imc = imc;
    }

    public void setCalories_needed(int calories_needed) {
        this.calories_needed = calories_needed;
    }


    public Set<String> getRole() {
        return this.role;
    }

    public void setRole(Set<String> role) {
        this.role = role;
    }

}