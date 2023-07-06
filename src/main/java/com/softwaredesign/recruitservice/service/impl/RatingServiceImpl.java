package com.softwaredesign.recruitservice.service.impl;

import com.softwaredesign.recruitservice.model.Rating;
import com.softwaredesign.recruitservice.model.User;
import com.softwaredesign.recruitservice.model.enums.SalaryType;
import com.softwaredesign.recruitservice.model.enums.Score;
import com.softwaredesign.recruitservice.repository.RatingRepository;
import com.softwaredesign.recruitservice.service.RatingService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RatingServiceImpl extends GenericServiceImpl<Rating, Long, RatingRepository> implements RatingService {

    public RatingServiceImpl(RatingRepository repository) {
        super(repository);
    }

}





