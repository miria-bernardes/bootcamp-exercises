package com.bootcamp.exercises.classfour.martegroupevent;

import java.util.ArrayList;
import java.util.List;

public class Evento {

    List<Convidado> convidados;
    List<FogosDeArtificios> fogosDeArtificios = new ArrayList<>();

    public Evento(List<Convidado> convidados, List<FogosDeArtificios> fogosDeArtificios) {
        this.convidados = convidados;
        this.fogosDeArtificios = fogosDeArtificios;
    }

    public void apagarVelas() {
        distribuirBolo();
        fogosDeArtificios.forEach(e -> e.dispararFogos());
    }

    private void distribuirBolo() {
        for (int i = 0; i < convidados.size(); i++) {
            if(convidados.get(i).getTipo().name().equals(TipoDeConvidado.MELI.name())) {
                convidados.get(i).comer("Viva la Chiqui !!");
            }

            convidados.get(i).comer();
        }
    }

    @Override
    public String toString() {
        return "Evento{" +
                "convidados=" + convidados +
                " " +
                '}';
    }
}
