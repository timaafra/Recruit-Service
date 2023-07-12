package com.softwaredesign.recruitservice.service;

import com.softwaredesign.recruitservice.model.Rating;
import com.softwaredesign.recruitservice.model.enums.Score;

public interface RatingService extends GenericService<Rating, Long>{


    Rating getByScore(Score score);

    void createRating(Rating rating);
}
