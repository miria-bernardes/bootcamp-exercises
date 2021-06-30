package com.bootcamp.exercises.classfour.savetheropa;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Vestuario> vestuarios = new ArrayList<>();
        GuardaRoupa guardaRoupa =  new GuardaRoupa();

        vestuarios.add(new Vestuario("Isabella Matte", "blazer cropped holly"));
        vestuarios.add(new Vestuario("Isabella Matte", "Calça Alfaiataria Reta Chloe"));

        guardaRoupa.guardarVestuarios(vestuarios);

        guardaRoupa.mostrarVestuarios();

        guardaRoupa.devolverVestuarios(1);

    }
}
