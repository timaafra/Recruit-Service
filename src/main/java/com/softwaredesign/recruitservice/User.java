package com.softwaredesign.recruitservice;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Integer id;
    private String firstName;
    private String lastName;
    private long nationalCode;
    private long personnelCode;
    @OneToOne
    @JoinColumn(name = "title_id")
    private JobTitle title;

}
