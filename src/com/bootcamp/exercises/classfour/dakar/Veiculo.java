package com.bootcamp.exercises.classfour.dakar;

import java.util.Comparator;
import java.util.Objects;

public class Veiculo  {
    private int velocidade;
    private int aceleracao;
    private int anguloDeGiro;
    private String placa;
    private double peso;
    private int rodas;
    private double desempenho;

    public Veiculo(int velocidade, int aceleracao, int anguloDeGiro, String placa, double peso, int rodas) {
        this.velocidade = velocidade;
        this.aceleracao = aceleracao;
        this.anguloDeGiro = anguloDeGiro;
        this.placa = placa;
        this.peso = peso;
        this.rodas = rodas;

        definirDesempenho();
    }

    public Veiculo(String placa) {
        this.placa = placa;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public int getAceleracao() {
        return aceleracao;
    }

    public void setAceleracao(int aceleracao) {
        this.aceleracao = aceleracao;
    }

    public int getAnguloDeGiro() {
        return anguloDeGiro;
    }

    public void setAnguloDeGiro(int anguloDeGiro) {
        this.anguloDeGiro = anguloDeGiro;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getRodas() {
        return rodas;
    }

    public void setRodas(int rodas) {
        this.rodas = rodas;
    }

    public double getDesempenho() {
        return desempenho;
    }

    public void setDesempenho(double desempenho) {
        this.desempenho = desempenho;
    }

    public void definirDesempenho() {
        desempenho =  velocidade *  aceleracao / ( anguloDeGiro * (peso - rodas * 100));
    }

    @Override
    public String toString() {
        return "Veiculo{" +
                "velocidade=" + velocidade +
                ", aceleracao=" + aceleracao +
                ", anguloDeGiro=" + anguloDeGiro +
                ", placa='" + placa + '\'' +
                ", peso=" + peso +
                ", rodas=" + rodas +
                ", desempenho=" + desempenho +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Veiculo)) return false;
        Veiculo veiculo = (Veiculo) o;
        return getVelocidade() == veiculo.getVelocidade() && getAceleracao() == veiculo.getAceleracao() &&
                getAnguloDeGiro() == veiculo.getAnguloDeGiro() &&
                Double.compare(veiculo.getPeso(), getPeso()) == 0 && getRodas() == veiculo.getRodas() &&
                Objects.equals(getPlaca(), veiculo.getPlaca());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getVelocidade(), getAceleracao(), getAnguloDeGiro(), getPlaca(), getPeso(), getRodas());
    }
}
