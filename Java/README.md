
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
