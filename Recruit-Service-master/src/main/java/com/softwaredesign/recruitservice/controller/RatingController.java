package com.softwaredesign.recruitservice.controller;

import com.softwaredesign.recruitservice.model.Rating;
import com.softwaredesign.recruitservice.model.enums.Score;
import com.softwaredesign.recruitservice.service.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/ratings")
public class RatingController {

    private final RatingService ratingService;

    @Autowired
    public RatingController(RatingService ratingService) {
        this.ratingService = ratingService;
    }

    @PostMapping("/")
    public ResponseEntity<Rating> createRating(@RequestBody Rating rating) {
        ratingService.createRating(rating);
        return new ResponseEntity<>(rating, HttpStatus.CREATED);
    }

    @PutMapping("/")
    public ResponseEntity<Rating> updateRating(@RequestBody Rating rating) {
        Rating updatedRating = ratingService.update(rating);
        return new ResponseEntity<>(updatedRating, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Rating> getRatingById(@PathVariable("id") Long id) throws Throwable {
        Rating rating = ratingService.getById(id);
        if (rating != null) {
            return new ResponseEntity<>(rating, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/{score}")
    public ResponseEntity<Rating> getRatingByScore(@PathVariable("score") Score score) {
        Rating rating = ratingService.getByScore(score);
        if (rating != null) {
            return new ResponseEntity<>(rating, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteRating(@PathVariable("id") Long id) {
        ratingService.deleteById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
