package com.bootcamp.exercises.classfour.martegroupevent;

public class Convidado {

    private TipoDeConvidado tipo;
    private String nome;
    private int idade;

    public Convidado(TipoDeConvidado tipo, String nome, int idade) {
        this.tipo = tipo;
        this.nome = nome;
        this.idade = idade;
    }

    public TipoDeConvidado getTipo() {
        return tipo;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setTipo(TipoDeConvidado tipo) {
        this.tipo = tipo;
    }

    public void comer() {
        System.out.println("yeaaah");
    }

    public void comer(String comemoracao) {
        System.out.println(comemoracao);
    }

    @Override
    public String toString() {
        return "Convidado{" +
                "tipo=" + tipo +
                ", nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
    }
}
