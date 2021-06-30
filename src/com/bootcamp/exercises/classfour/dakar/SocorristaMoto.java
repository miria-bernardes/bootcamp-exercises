package com.bootcamp.exercises.classfour.dakar;

public class SocorristaMoto  extends Veiculo{


    public SocorristaMoto(String placa) {
        super(placa);
    }

    public void socorrer(Moto moto) {
        System.out.println("Socorrendo moto: " + moto);
    }
}
