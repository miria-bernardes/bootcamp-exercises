package com.bootcamp.exercises.classone;

import java.util.Scanner;

public class ShowMultiples {

    public static void main(String[] args) {
        System.out.println("Digite a quantidade de multiplos: ");
        Scanner input = new Scanner(System.in);

        System.out.println("Digite outro número qualquer: ");
        Scanner inputTwo = new Scanner(System.in);

        int num = input.nextInt();
        int num2 = inputTwo.nextInt();

        for (int i = 1; i <= num; i++) {
            if (num2 % i == 0) {
                System.out.println(i);
            }
        }


    }
}
