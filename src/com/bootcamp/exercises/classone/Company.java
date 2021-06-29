package com.bootcamp.exercises.classone;

import java.math.BigDecimal;

public class Company {
    private BigDecimal value =  new BigDecimal("0");
    private BigDecimal avgAnnualGrowth = new BigDecimal("0.0");


    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }


    public void setAvgAnnualGrowth(BigDecimal avgAnnualGrowth) {
        this.avgAnnualGrowth = avgAnnualGrowth;
    }

    public void calcAnnualIncome() {
        value = value.multiply(avgAnnualGrowth).add(value);
    }
}
