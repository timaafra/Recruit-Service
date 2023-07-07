package com.softwaredesign.recruitservice.model.enums;

import com.softwaredesign.recruitservice.exception.InvalidInputException;
import lombok.Getter;

public enum SalaryType {
    SALARIED(1),HOURLY(2);

    @Getter
    private Integer value;

    SalaryType(Integer value) {
        this.value = value;
    }
    public static SalaryType getSalaryType(Integer value){
        for (SalaryType salaryType :
                values()) {
            if (salaryType .getValue().equals(value))
                return salaryType ;
        }
        throw new InvalidInputException("invalid value");
    }
}
