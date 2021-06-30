package com.bootcamp.exercises.classfour.dakar;

public class Carro extends Veiculo{
    private static double PESO = 1000;
    private static int RODAS = 4;

    public Carro(int velocidade, int aceleracao, int anguloDeGiro, String placa ) {
        super(velocidade, aceleracao, anguloDeGiro, placa, PESO, RODAS);
    }

    @Override
    public String toString() {
        return "Carro{} " + super.toString();
    }
}
