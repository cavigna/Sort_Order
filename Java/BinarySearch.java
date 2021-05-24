package com.nacho;

import java.util.Arrays;

public class BinarySearch {
    public static void binarySearch(int [] array, int valor, int  inicio, int fin){
        if (inicio>fin) {
            System.out.println();
            System.out.println("No se encontró el valor " + valor + " en el Array");
        } else {
            System.out.println(Arrays.toString(array));
            System.out.printf("Se buscará desde %s, hasta %s %n", array[inicio], array[fin]);
            System.out.println();
            var medio = (inicio + fin) / 2;
            System.out.printf("El valor medio será: %s %n", array[medio]);
            System.out.println();
            if (valor == array[(int) medio]) {
                System.out.printf("Se encontró en array[%s] ", medio);
                System.out.println();
            } else {

                if (valor < array[medio]) {

                    binarySearch(array, valor, inicio, medio - 1);
                } else {
                    binarySearch(array, valor, medio + 1, fin);
                }
            }
        }
    }

}
