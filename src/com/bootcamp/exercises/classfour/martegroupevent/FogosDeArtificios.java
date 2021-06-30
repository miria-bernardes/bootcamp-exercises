package com.bootcamp.exercises.classfour.martegroupevent;

import java.util.Random;

public class FogosDeArtificios {

    public void dispararFogos() {
        int leftLimit = 97;
        int rightLimit = 122;
        int targetStringLength = 10;
        Random random = new Random();

        String generatedString = random.ints(leftLimit, rightLimit + 1)
                .limit(targetStringLength)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();

        System.out.println("*_\\\\/_* " + generatedString + " ?!:;!!\"__!");
    };

}
