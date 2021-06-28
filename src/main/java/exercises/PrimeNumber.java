package src.main.java.exercises;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println("Digite um número qualquer: ");
        Scanner input = new Scanner(System.in);

        int num = input.nextInt();



        if (isPrimeNumber(num)) {
            System.out.println("Nao eh primo");
        } else {
            System.out.println("eh primo");
        }

    }

    public static boolean isPrimeNumber(int num) {

        if (num <= 1) return false;

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
