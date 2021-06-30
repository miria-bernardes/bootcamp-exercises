package com.bootcamp.exercises.classfour.savetheropa;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GuardaRoupa {

    Map<Integer, List<Vestuario>> roupas = new HashMap<>();
    private int identificador = 1;

    public Integer guardarVestuarios(List<Vestuario> listaDeVestuario){

        int key = identificador;

        roupas.put(identificador, listaDeVestuario);


        System.out.println("Identificador: " + key);

        return key;
    }

    public void mostrarVestuarios() {
        roupas.forEach((key, value) -> System.out.println(String.format("Identificador: %d - Roupas: %s", key, value)));
    }

    public List<Vestuario> devolverVestuarios(Integer id) {
        List<Vestuario> vestuarios = roupas.get(id);

        roupas.remove(id);

        return vestuarios;
    }


}
