package com.softwaredesign.recruitservice.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="account")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Account extends BaseEntity{


    @Column(name = "user_name",nullable = false )
    private String userName;


    @Column(name = "password",nullable = false ,length = 30)
    private String password;



    public boolean Validation(String password){
        return this.password.equals(password);
    }



}
