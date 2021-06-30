package com.bootcamp.exercises.classtwo.classmanagement;

public class Disciplina {
    private String nome;
    private int cargaHoraria;

    public Disciplina(String nome, int ch) {
        this.nome = nome;
        this.cargaHoraria = ch;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
}
