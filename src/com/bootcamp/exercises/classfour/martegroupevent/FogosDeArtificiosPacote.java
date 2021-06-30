package com.bootcamp.exercises.classfour.martegroupevent;

import java.util.ArrayList;
import java.util.List;

public class FogosDeArtificiosPacote extends FogosDeArtificios{

    List<FogosDeArtificios> fogosDeArtificiosIndividuais = new ArrayList<>();
    List<FogosDeArtificiosPacote> fogosDeArtificiosPacote = new ArrayList<>();

    public List<FogosDeArtificios> getFogosDeArtificiosIndividuais() {
        return fogosDeArtificiosIndividuais;
    }

    public void setFogosDeArtificiosIndividuais(
            List<FogosDeArtificios> fogosDeArtificiosIndividuais) {
        this.fogosDeArtificiosIndividuais = fogosDeArtificiosIndividuais;
    }

    public List<FogosDeArtificiosPacote> getFogosDeArtificiosPacote() {
        return fogosDeArtificiosPacote;
    }

    public void setFogosDeArtificiosPacote(
            List<FogosDeArtificiosPacote> fogosDeArtificiosPacote) {
        this.fogosDeArtificiosPacote = fogosDeArtificiosPacote;
    }
}
