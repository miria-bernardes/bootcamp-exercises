package com.bootcamp.exercises.classfour.dakar;

public class SocorristaCarro  extends Veiculo{


    public SocorristaCarro(String placa) {
        super(placa);
    }

    public void socorrer(Carro carro) {
        System.out.println("Socorrendo o carro: " + carro);
    };
}
