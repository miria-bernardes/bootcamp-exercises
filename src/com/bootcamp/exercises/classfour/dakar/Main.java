package com.bootcamp.exercises.classfour.dakar;

public class Main {
    public static void main(String[] args) {
        Corrida corrida = new Corrida(30000, 10000, "Indianapolis Motor Speedway", 10);
        corrida.registrarCarro(100, 10, 15, "ABCD303");
        corrida.registrarCarro(80, 15, 15, "ABCD304");
        corrida.registrarMoto(120, 20, 15, "ABCD305");

        System.out.println("Vencedor da corrida:  " + corrida.determinarVencedor());

        corrida.socorrerCarro("ABCD303");

        corrida.getSocorristaCarro().socorrer((Carro) corrida.buscarVeiculoPorPlaca("ABCD303"));

        corrida.socorrerMoto("ABCD305");
        corrida.getSocorristaMoto().socorrer((Moto) corrida.buscarVeiculoPorPlaca("ABCD305"));
    }
}
