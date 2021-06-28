package src.main.java.exercises;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println("Digite um número qualquer: ");
        Scanner input = new Scanner(System.in);

        int num = input.nextInt();


        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                System.out.println("Nao eh primo");
                break;
            } else {
                System.out.println("eh primo");
                break;
            }
        }
    }
}
