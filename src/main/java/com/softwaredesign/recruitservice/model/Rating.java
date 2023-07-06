package com.softwaredesign.recruitservice.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Table(name = "rating")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Rating extends BaseEntity {

    @Column(name = "score", nullable = false)
    private Integer score;

    @Column(name = "date", nullable = false)

    private LocalDate date;

}
