package com.bootcamp.exercises.classfour.dakar;

import java.util.ArrayList;
import java.util.List;

public class Corrida {
    private int distancia;
    private double premioEmDolares;
    private String nome;
    private int quantidadeVeiculosPermitidos = 4;
    private List<Veiculo> listaVeiculos;
    private SocorristaCarro socorristaCarro;
    private SocorristaMoto socorristaMoto;

    public Corrida(int distancia, double premioEmDolares, String nome, int quantidadeVeiculosPermitidos) {
        this.distancia = distancia;
        this.premioEmDolares = premioEmDolares;
        this.nome = nome;
        this.quantidadeVeiculosPermitidos = quantidadeVeiculosPermitidos;
        this.listaVeiculos = new ArrayList<>();

        this.socorristaMoto = new SocorristaMoto("1223");
        this.socorristaCarro = new SocorristaCarro("1222");

    }

    public void registrarCarro(int velocidade, int aceleracao, int anguloDeGiro, String patente) {
        if (!jaEstaNaCorrida(patente)) {
            this.listaVeiculos.add(new Carro(velocidade, aceleracao, anguloDeGiro, patente));
        }
    };

    public void registrarMoto(int velocidade, int aceleracao, int anguloDeGiro, String patente){
        if (!jaEstaNaCorrida(patente)) {
                this.listaVeiculos.add(new Moto(velocidade, aceleracao, anguloDeGiro, patente));
        }
    };

    public void removerVeiculo(Veiculo veiculo) {
        listaVeiculos.remove(veiculo);
    };

    public void removerVeiculoPorPlaca(String placa) {
        for (int i = 0; i < listaVeiculos.size(); i++) {
            if(listaVeiculos.get(i).getPlaca().equals(placa)) {
                listaVeiculos.remove(i);
            }
        }
    };

    public boolean verificarDisponibilidade(String placa) throws Exception {
        if (listaVeiculos.size() >= quantidadeVeiculosPermitidos) {
            throw new Exception("Limite de quantidade de veiculos na corrida já foi atingido");
        }

        if (jaEstaNaCorrida(placa)) {
            throw new Exception("Veiculo já esta na corrida");
        }

        return false;

    }

    public boolean jaEstaNaCorrida(String placa) {
        return listaVeiculos.stream().allMatch(e -> e.getPlaca().equals(placa));
    }

    public Veiculo determinarVencedor() {

    }

    public void socorrerCarro(String documento) {
        System.out.println("Socorrendo carro " + documento);
    }

    public void socorrerMoto(String documento) {
        System.out.println("Socorrendo moto " + documento);
    }


}
