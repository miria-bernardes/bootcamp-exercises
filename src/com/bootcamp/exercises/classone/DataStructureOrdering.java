package com.bootcamp.exercises.classone;

import java.util.Arrays;

public class DataStructureOrdering {
    public static void main(String[] args) {
        int vector [] = {52, 10, 85, 1324, 01, 13, 62, 30, 12 ,127};

        int vectorAscendingOrder [] = Arrays.stream(vector).sorted().toArray();


       for (int i = 0; i < vectorAscendingOrder.length; i++) {
           System.out.println(vectorAscendingOrder[i]);
       }


       for (int i = vectorAscendingOrder.length - 1; i > 0; i--) {
           System.out.println(vectorAscendingOrder[i]);
       }
    }




}
