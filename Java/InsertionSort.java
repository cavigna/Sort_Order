package com.nacho;

import java.util.Arrays;
//|| array[0]>array[1] && array[i]>array[array.length-1]
public class InsertionSort {
    public  void insertionSort(int[] array, int stop){
        if(stop<=array.length-3){
            /* Luego de la primera iteración aseguramos que los
            últimos valores son los mas altos.

             */

            insertionSort( array, stop+1);
        }
        System.out.println(Arrays.toString(array));
        System.out.println("");

        var k = 0;
        for (var i = 1; i< array.length; i++){
            if(array[i]< array[i-1] ){
                System.out.println(array[i] + " < === > " + array[i-1]);
                k = array[i];
                array[i] = array[i-1];
                array[i-1]=k;
            }

        }


    }
}
