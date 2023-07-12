package com.softwaredesign.recruitservice.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

@Entity
@Table(name = "user")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class User extends BaseEntity {


    @Column(name = "employee_id")
    private Long employeeID;


    @Column(name = "name", nullable = false)
    private String name;


    @Column(name = "last_name", nullable = false)
    private String lastName;

    @Column(name = "national_code", nullable = false)
    private String nationalCode;

    @Column(name = "birth_date", nullable = false)
    private Date birthDate;

    @Column(name = "birth_place", nullable = false)
    private String birthPlace;

    @Column(name = "father_name", nullable = false)
    private String fatherName;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "account_id")
    private Account account;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "job_id")
    private JobTitle job;


    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "ratting_id")
    private Rating rating;

    @Column(name = "entry_hour")
    private LocalTime entryHour;


    @Column(name = "exit_hour")
    private LocalTime exitHour;


}