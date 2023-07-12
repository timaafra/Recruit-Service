package com.softwaredesign.recruitservice.model;

import com.softwaredesign.recruitservice.model.enums.Score;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Table(name = "rating")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Rating extends BaseEntity  {



    @Enumerated(EnumType.STRING)
    @Column(name = "score_type",columnDefinition = "enum('EXCELLENT','OK','BAD')",nullable = false)
    private Score score;

    @Column(name = "date", nullable = false)
    private LocalDate date;




}
