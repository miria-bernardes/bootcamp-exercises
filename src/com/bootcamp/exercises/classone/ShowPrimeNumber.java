package com.bootcamp.exercises.classone;

import java.util.Scanner;

public class ShowPrimeNumber {
    public static void main(String[] args) {
        System.out.println("Digite um número qualquer: ");
        Scanner input = new Scanner(System.in);

        int num = input.nextInt();

        for (int i = 0; i < num ; i++) {
            if (PrimeNumber.isPrimeNumber(i)) {
                System.out.println(i);
            }
        }

    }
}
