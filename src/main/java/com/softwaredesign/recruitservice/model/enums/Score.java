package com.softwaredesign.recruitservice.model.enums;

import com.softwaredesign.recruitservice.exception.InvalidInputException;
import lombok.Getter;

public enum Score {
  EXCELLENT(1),OK(2),BAD(3);


  @Getter
  private Integer value;

  Score(Integer value) {
    this.value = value;
  }
  public static Score getScoreType(Integer value){
    for (Score ScoreType :
            values()) {
      if (ScoreType .getValue().equals(value))
        return ScoreType ;
    }
    throw new InvalidInputException("invalid value");
  }




}
