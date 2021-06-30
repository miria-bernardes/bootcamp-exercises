package com.bootcamp.exercises.classfour.dakar;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collector;

public class Corrida {
    private int distancia;
    private double premioEmDolares;
    private String nome;
    private int quantidadeVeiculosPermitidos = 4;
    private List<Veiculo> listaVeiculos;
    private Veiculo vencedor;
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

    public SocorristaCarro getSocorristaCarro() {
        return socorristaCarro;
    }

    public void setSocorristaCarro(SocorristaCarro socorristaCarro) {
        this.socorristaCarro = socorristaCarro;
    }

    public SocorristaMoto getSocorristaMoto() {
        return socorristaMoto;
    }

    public void setSocorristaMoto(SocorristaMoto socorristaMoto) {
        this.socorristaMoto = socorristaMoto;
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
        listaVeiculos.removeIf(e -> e.getPlaca().equals(placa));
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
        return listaVeiculos.stream().anyMatch(e -> e.getPlaca().equals(placa));
    }

    public Veiculo determinarVencedor() {
       return listaVeiculos.stream().max(Comparator.comparingDouble(Veiculo::getDesempenho)).get();
    }

    public void socorrerCarro(String documento) {
        System.out.println("Socorrendo carro " + documento);
    }

    public void socorrerMoto(String documento) {
        System.out.println("Socorrendo moto " + documento);
    }


    public Veiculo buscarVeiculoPorPlaca(String s) {
        return listaVeiculos.stream().filter(e -> e.getPlaca().equals(s)).findFirst().get();
    }
}
