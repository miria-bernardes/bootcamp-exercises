package com.bootcamp.exercises.classone;

import java.math.BigDecimal;
import java.time.LocalDate;

public class BigDecimalAndStringFormatTraining {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();

        Company companyX = new Company();
        companyX.setValue( new BigDecimal("1300.000"));
        companyX.setAvgAnnualGrowth(new BigDecimal("1.48"));

        Company companyY = new Company();
        companyY.setValue(new BigDecimal("18400.000"));
        companyY.setAvgAnnualGrowth(new BigDecimal("0.32"));

        int increaseYear = 1;

        while (companyX.getValue().compareTo(companyY.getValue()) == -1) {

            companyX.calcAnnualIncome();
            companyY.calcAnnualIncome();

            System.out.println(String.format("Empresa %s - %s - Valor da Empresa: %s", "X", localDate.plusYears(increaseYear), companyX.getValue().toString()));

            System.out.println(String.format("Empresa %s - %s - Valor da Empresa: %s", "Y", localDate.plusYears(increaseYear), companyY.getValue().toString()));

            increaseYear++;

        }
    }

}
