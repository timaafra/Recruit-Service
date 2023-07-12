package com.softwaredesign.recruitservice.service.impl;

import com.softwaredesign.recruitservice.model.Rating;
import com.softwaredesign.recruitservice.model.enums.Score;
import com.softwaredesign.recruitservice.repository.RatingRepository;
import com.softwaredesign.recruitservice.service.RatingService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
@RequiredArgsConstructor
public class RatingServiceImpl extends GenericServiceImpl<Rating, Long, RatingRepository> implements RatingService {
    private final RatingRepository repository;

    @Override
    public Rating getByScore(Score score) {
        return repository.findByScore(score);
    }


    @Override
    public void createRating(Rating rating) {
        rating.setDate(LocalDate.now());
        repository.save(rating);
    }

}





