package com.softwaredesign.recruitservice.repository;

import com.softwaredesign.recruitservice.model.Rating;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RatingRepository extends CrudRepository<Rating, Integer> {

    Rating findRatingById(Long id);
}
