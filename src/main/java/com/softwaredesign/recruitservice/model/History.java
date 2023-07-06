package com.softwaredesign.recruitservice.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.Date;
@Entity
@Table(name="history")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class History extends BaseEntity{



    @Column(name = "date",nullable = false)
    private Date date;


    @Column(name = "entry_hour",nullable = false)
    private LocalDate entry;


    @Column(name ="exit_hour",nullable = false)
    private LocalDate exit;



    @ManyToOne(cascade = CascadeType.ALL )
    @JoinColumn(name = "user_id",referencedColumnName = "id", nullable = false)
    private User user;


}
