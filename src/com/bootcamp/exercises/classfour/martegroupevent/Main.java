package com.bootcamp.exercises.classfour.martegroupevent;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Convidado> convidados = new ArrayList<>();

        convidados.add(new Convidado(TipoDeConvidado.MELI, "Miria Bernades Couto", 25));
        convidados.add(new Convidado(TipoDeConvidado.STANDARD, "Kelvin Wendel de Souza Couto", 30));
        convidados.add(new Convidado(TipoDeConvidado.STANDARD, "Ananda Kelly Bernardes de Souza Couto", 1));

        List<FogosDeArtificios> fogosDeArtificios = new ArrayList<>();

        FogosDeArtificiosPacote fogosDeArtificiosPacote = new FogosDeArtificiosPacote();

        fogosDeArtificios.add(new FogosDeArtificios());
        fogosDeArtificios.add(new FogosDeArtificiosPacote());

        fogosDeArtificios.add(new FogosDeArtificios());
        fogosDeArtificios.add(fogosDeArtificiosPacote);
        fogosDeArtificios.add(new FogosDeArtificios());

        Evento evento = new Evento(convidados, fogosDeArtificios);

        evento.apagarVelas();
    }
}
