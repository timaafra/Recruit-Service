package com.softwaredesign.recruitservice.model;


import com.softwaredesign.recruitservice.model.JobTitle;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.List;

@Entity
@Table(name="user")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class User extends BaseEntity {





    @Column(name="employee_id")
    private Long employeeID;



    @Column(name = "name",nullable = false )
    private String name;


    @Column(name = "last_name",nullable = false )
    private String lastName;

    @Column(name = "national_code",nullable = false )
    private String nationalCode;

    @Column(name = "birth_date",nullable = false )
    private Date birthDate;

    @Column(name = "birth_place",nullable = false )
    private String birthPlace;

    @Column(name = "father_name",nullable = false )
    private String fatherName;

    @OneToOne(cascade=CascadeType.ALL)
    @JoinColumn(name = "account_id")
    private Account account;

    @OneToOne(cascade=CascadeType.ALL)
    @JoinColumn(name = "job_id")
    private JobTitle job;



    @OneToMany(cascade = CascadeType.ALL,mappedBy = "user")
    private List<Rating> ratingList;




}