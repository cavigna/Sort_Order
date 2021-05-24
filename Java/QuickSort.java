package com.nacho;


import java.util.Arrays;


public class QuickSort {
    public void quickSort(int [] array, int izquierda, int derecha){

        if(izquierda<derecha){
            int particion_pos =particion(array, izquierda, derecha);
            quickSort(array, izquierda, particion_pos-1);

            quickSort(array, particion_pos+1, derecha);

            /*
            LEER PRIMERO PARTICIóN LUEGO VOLVER AQUÍ
            Comenzamos desde izquierda = 0 y derecha = array.length-1
            Mientras la posición de la izquierda no sea mayor a la derecha seguimos con la función.
            La implementamos de manera recursiva desde 0 hasta la posición que nos devuelva la partición menos 1.
            Del mismo modo la implementamos desde la partición más 1 hasta el final del array.
            Básicamente dividimos en dos la búsqueda, en una sección izquierda y una derecha que tendrá su pivot y sus
            propios punteros i,j.
            Ej:
            Al terminar la primera recursión, hemos intercambiado el pivot por uno nuevo. Ahora
            nuestra array se transformará de la siguiente manera:
            [15, 23, 95, 8, 63, 321, 1786, -523, 42] ==> [15, 23, -523, 8, 42, 321, 1786, 95, 63]

            La posición que regresa la función partición de i es de 4 (particion_pos). Aquí se cambió 42 por 63.
            El método se implementará desde la nueva posición de 42 para la izquierda y la derecha(No inclusiva).
               [15,23,-523] 42 [321, 1786, 95 , 63]
            En la parte IZQUIERDA DE LA RECURSION ==> quickSort(array, izquierda=0, derecha = 4-1 =3)
            array_izquierda = [15, 23, -523, 8] | el pivot será 8.
                              -523 <==> 15

                              [-523, 23 , 15, 8]  |  el pivot será 8.
                              No hay menor número entre 8 y 15.
                              15 <==> 8

                              [-523,23,8,15] | el pivot será 15.
                              23 <==>8

                              [-523,8,23,15] | el pivot será 15.
                              No hay menor número entre 15 y 23.
                              23 <==> 15

                              Finalmente:
                              [-523, 8, 15, 23]
                              TODO MIENTRAS ESTA RECURSIÓN SE EJECUTE izquierda será MENOR A DERECHA.

            En la parte DERECHA DE LA RECURSION ==> quickSort(array, izquierda=4+1 =5, derecha = fin array)
            array_derecha = [321, 1786, 95 , 63] | el pivot será 63.
                            No hay menor número entre 321 y 63.
                            321 <==> 63
                            [63, 1786, 95 , 321] | el pivot será 321.
                            1786 <==> 321
                            [63, 321, 95 , 1786] | el pivot será 1786.
                            No hay MAYOR número entre 63 y 1786.
                            321 <==> 95
                            Finalmente:
                            [63, 925, 321, 1786]
                            TODO EN ESTA PARTE EVENTUALMENTE IZQUIERDA SERÁ IGUAL A DERECHA.
                            Esto se debe a como se formuló el método: izquierda irá incrementando su posición.
                            En este ejemplo izquierda será igual a 8 ==> array.length-1

          RESULTADO
            Originalmente:
                            [15,23,-523] 42 [321, 1786, 95 , 63]
            Con las implementaciones:
                            [-523, 8, 15, 23]  42 [ 63, 95, 321, 1786]
                            [-523, 8, 15, 23, 42, 63, 95, 321, 1786]



             */
        }

    }

    private  int particion(int[] array, int izquierda, int derecha){
        int i = izquierda, j = derecha, k; //Puntero izquierda, derecha
        int pivot = array[derecha]; //pivote de la derecha. al principio es el ultimo elemento arr[-1]
        /* i==> i se mueve hacia la derecha y comprueba si algún valor es MAYOR al pivote.
                Cuando lo encuentra se detiene.
          j<== j se mueve hacia la izquierda. y comprueba si algún valor es MENOR al pivote.
                Cuando lo encuentra se detiene.
         Pivote = Este tiene como función ser el comparador con los punteros i, j. Cuando no haya más cambios con este,
        realizamos un swap entre el valor array[i] con el pivote. Ahora tendremos un nuevo pivote para comparar.
         */

        while (i<j) {
            /*
            Mientras el marcador de la izquierda (i) no supere al marcador de la derecha(j)
             */
            System.out.printf("Array = %s%n", Arrays.toString(array));
            while(i<derecha && array[i]<pivot){
                 /* Mientras que el indice de i sea menor a la derecha(el último elemento del array), es decir,
                 no llegó hasta el final del array. Además el de array[i] debe ser menor al pivot.
                 Siempre y cuando se cumpla, i avanza hacia la derecha (i++).
                 ej
                 Array = [15, 23, 95, 8, 63, 321, 1786, -523, 42] | pivote = 42  ==> El sentido de la vida,
                  el universo y todos lo demás

                         42 >15
                         42 > 23
                         42 < 95 ===> AQUí SE DETIENE i
                 */

                i++;
            }
            while(j>izquierda && array[j]>= pivot){//j > izquierda y el elemento array[j] es mayor al pivote

                 /* Mientras que el indice de j sea mayor a la izquierda(el primer elemento del array), es decir,
                 no llegó hasta el principio del array. Además el de array[j] debe ser menor al pivot.
                 Siempre y cuando se cumpla, i avanza hacia la derecha.
                 Array = [15, 23, 95, 8, 63, 321, 1786, -523, 42] | pivote = 42
                                                         42 > -523 ==> AQUí SE DETIENE j

                 */

                j--;
            }
            if(i<j){ // Si i es MENOR a j
                /*
                Si el índice de i es menor el de la izquierda. Se realiza el cambio
                Array = [15, 23, 95, 8, 63, 321, 1786, -523, 42] | pivote = 42

                array[i] = 95. Este es MAYOR que el pivote 42.
                array[j] = -523. Este es MENOR que el pivote 42.

                Por ende, se intercambian array[i] <==> array[j]
                Ahora nuestra array queda configurada así:

                    Array = [15, 23, -523, 8, 63, 321, 1786, 95, 42]

                 */
                System.out.println();
                System.out.println("*** i menor a j ***");
                System.out.println();
                System.out.printf("Pivot = %d %n",pivot);

                System.out.printf("%narray[%s] = %s <==> array[%s] = %s %n", i, array[i], j, array[j]);
                System.out.println();
                k = array[i];
                array[i] = array[j];
                array[j] =k; // SWAP array[i] por array[j]

            }

        }

        while(array[i]>pivot){
            /*
            Cuando j que viene por la derecha, sobrepasa a i(que es el que busca el mayor), quiere decir que no hay hay
            un numero menor en ese rango, por ende array[i] debe ir al último, por que este es mayor que el pivote.
            Intercambiamos array[i] por el pivote:
                        [15, 23, -523, 8, 63, 321, 1786, 95, 42]
                        42 > 15                         42 < 95
                        42 > 23                         42 < 1786
                        42 > -523                       42 < 321
         i se detiene   42 < 63                         42 < 63
                                                        42 > 8 j se detiene.

            En este caso j superó a i. Entonces, 42 ya no es el mayor valor, por lo que se intercambia el pivote con
            array[i] (siempre y cuando sea mayor al pivote)
            Como resultado, nuestra Array queda de la siguiente manera:

                Array = [15, 23, -523, 8, 42, 321, 1786, 95, 63]

            y volvemos a iterar nuevamente. Hasta que no haya un valor MAYOR al pivote.

             */
            System.out.println();
            System.out.println("*** Se agotó búsqueda.  ***");
            System.out.println("*** Swap array[i](mayor) por Pivot ");
            System.out.println();
            System.out.printf("Pivot = %d %n",pivot);

            System.out.printf("%narray[%s] = %s <==> array[%s](Pivot) = %s %n", i, array[i], derecha, array[derecha]);
            System.out.println();
            k = array[i];
            array[i] = array[derecha];
            array[derecha] =k;
        }


        return i;
        /*
        Lo importante de esta función es que nos devuelve la posición de i. Es decir, desde donde debe empezar a
        realizar la búsqueda nuevamente. Tanto para la izquierda de i como la derecha de i
         */
    }

}























/*
    public void quickSort(int [] array){
        System.out.println(Arrays.toString(array));
        quickSort(array, 0 , array.length-1);
        System.out.println(Arrays.toString(array));


    }
    private void quickSort(int[] array, int min, int max){
         if (min < max+1){
             int p = particion(array, min, max);
             quickSort(array, p+1, max);
         }
    }
    private void swap(int [] array, int i, int j){
        int k = array[i];
        array[i] = array[j];
        array[j] = k;
    }
    private int pivot(int min, int max){
        Random random = new Random();
        return random.nextInt((max-min)+1)+min ;
    }

    private  int particion(int [] array, int min, int max){
        swap(array, min, pivot(min, max));
        int limite = min + 1;
        for (int i=limite; i<= max; i++){
            if(array[i]<array[max]){
                swap(array, i, limite++);
            }
        }
        swap(array, min, limite-1);
        return limite-1;
    }
 */