package com.softwaredesign.recruitservice.model;

import com.softwaredesign.recruitservice.model.enums.SalaryType;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name="job_title")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class JobTitle extends BaseEntity {




    @Column(name = "name",nullable = false )
    private String name;


    @Column(name = "salary_per_hour",nullable = false )
    private Double salaryPerHour;


    @Enumerated(EnumType.STRING)
    @Column(name = "salary_type",columnDefinition = "enum('SALARIED','HOURLY')",nullable = false)
    private SalaryType salaryType;







}
