package com.bootcamp.exercises.classfour.dakar;

public class Moto extends Veiculo{

    private static double PESO = 1000;
    private static int RODAS = 300;

    public Moto(int velocidade, int aceleracao, int anguloDeGiro, String placa) {
        super(velocidade, aceleracao, anguloDeGiro, placa, PESO, RODAS);
    }


    @Override
    public String toString() {
        return "Moto{} " + super.toString();
    }
}
