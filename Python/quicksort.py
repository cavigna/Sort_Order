def quicksort(array=[], izquierda=0, derecha=None):
    """
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
                            [-523, 8, 15, 23, 42, 63, 95, 321, 1786]"""
    if derecha is None:
        derecha= len(array)-1
    #print(array)
    if izquierda<derecha:
        particion_p = particion(array, izquierda, derecha) # posicion de la particion       
        quicksort(array, izquierda, particion_p-1) # ordena derecha Recursivamente       
        quicksort(array, particion_p+1, derecha) # ordena izquierda Recursivamente


def particion(array, izquierda, derecha):
    i = izquierda # puntero izquierda
    j = derecha - 1 # puntero derecha
    # i se mueve a la derecha
    #j se mueve a la izquierda
    pivot = array[derecha] # pivote de la derecha. al principio es el ultimo elemento arr[-1]
    
    """ i==> i se mueve hacia la derecha y comprueba si algún valor es MAYOR al pivote.
                Cuando lo encuentra se detiene.
        j<== j se mueve hacia la izquierda. y comprueba si algún valor es MENOR al pivote.
                Cuando lo encuentra se detiene.
        Pivote = Este tiene como función ser el comparador con los punteros i, j. Cuando no haya más cambios con este,
        realizamos un swap entre el valor array[i] con el pivote. Ahora tendremos un nuevo pivote para comparar."""
    
    while i<j: # Mientras el marcador de la izquierda (i) no supere al marcador de la derecha(j)
        print(f'Array = {array}')
        print()
        while i< derecha and array[i]<pivot: # i es menor a la derecha y el elemento array de i es menor al pivot
            i += 1 # muevo i a la derecha
            """ 
            Mientras que el indice de i sea menor a la derecha(el último elemento del array), es decir,
            no llegó hasta el final del array. Además el de array[i] debe ser menor al pivot.
            Siempre y cuando se cumpla, i avanza hacia la derecha (i++).
            ej
            Array = [15, 23, 95, 8, 63, 321, 1786, -523, 42] | pivote = 42  ==> El sentido de la vida,
            el universo y todos lo demás
                    42 >15
                    42 > 23
                    42 < 95 ===> AQUí SE DETIENE i
            """

        while j> izquierda and array[j]>= pivot: # j > izquierda y el elemento array[j] es mayor al pivote 
            j-=1 # muevo j a la izquierda
        """
            Mientras que el indice de j sea mayor a la izquierda(el primer elemento del array), es decir,
            no llegó hasta el principio del array. Además el de array[j] debe ser menor al pivot.
            Siempre y cuando se cumpla, i avanza hacia la derecha.
            Array = [15, 23, 95, 8, 63, 321, 1786, -523, 42] | pivote = 42
                                                        42 > -523 ==> AQUí SE DETIENE j
        
        """    

        if i<j: # compruebo si i y j se cruzaron. Si no se cruzan:
            """
            Si el índice de i es menor el de la izquierda. Se realiza el cambio
                Array = [15, 23, 95, 8, 63, 321, 1786, -523, 42] | pivote = 42

                array[i] = 95. Este es MAYOR que el pivote 42.
                array[j] = -523. Este es MENOR que el pivote 42.

                Por ende, se intercambian array[i] <==> array[j]
                Ahora nuestra array queda configurada así:

                    Array = [15, 23, -523, 8, 63, 321, 1786, 95, 42]
            """
            print('*** i menor a j ***')
            print()
            print(f'Pivot: {pivot}')
            print()            
            #print(f' Se intercambia array[{i}] = {array[i]}'\
            #         f' por array[{j}] = {array[j]} ')            
            print(f'array[{i}] = {array[i]} <==> array[{j}] = {array[j]} ')     
            print()
            print('****************')
            print()
            array[i], array[j] = array[j], array[i] # intercambio los elementos i y j
            
    
    print()

    if array[i] > pivot: # Si se cruzan:
        """
            Cuando j que viene por la derecha, sobrepasa a i(que es el que busca el mayor), quiere decir que no hay hay
            un numero menor en ese rango, por ende array[i] debe ir al último, por que este es mayor que el pivote.
            Intercambiamos array[i] por el pivote:
                        [15, 23, -523, 8, 63, 321, 1786, 95, 42]
                        42 > 15                         42 < 95
                        42 > 23                         42 < 1786
                        42 > -523                       42 < 321
        i se detiene    42 < 63                         42 < 63
                                                        42 > 8 j se detiene.

            En este caso j superó a i. Entonces, 42 ya no es el mayor valor, por lo que se intercambia el pivote con
            array[i] (siempre y cuando sea mayor al pivote).

            Como resultado, nuestra Array queda de la siguiente manera:
                Array = [15, 23, -523, 8, 42, 321, 1786, 95, 63]
            y volvemos a iterar nuevamente. Hasta que no haya un valor MAYOR al pivote.
        """
        print('***Reemplazo de pivot****')
        print()
        print(f'Pivote: {pivot}')
        print()
        print(f'array[{i}] = {array[i]} <==> array[{derecha}](Pivote) = {pivot} ')
        print()     
        print('****************')
        array[i], array[derecha] = array[derecha], array[i] #intercambio i con el pivote
        #        Lo importante de esta función es que nos devuelve la posición de i. Es decir, desde donde debe empezar a
        #realizar la búsqueda nuevamente. Tanto para la izquierda de i como la derecha de i

    return i

#arr = [72,-5,42,89,-123,59,48,98,21]
arr = [9, 78, 15, 1764,-42, 42]
print(f'Array original = {arr}')
print()
quicksort(array=arr)
print(f'Array Ordenada = {arr}')

"""  **** Resultado  ****
Array original = [9, 78, 15, 1764, -42, 42]

Array = [9, 78, 15, 1764, -42, 42]

*** i menor a j ***

Pivot: 42

array[1] = 78 <==> array[4] = -42 

****************

Array = [9, -42, 15, 1764, 78, 42]


***Reemplazo de pivot****

Pivote: 42

array[3] = 1764 <==> array[5](Pivote) = 42 

****************
Array = [9, -42, 15, 42, 78, 1764]



***Reemplazo de pivot****

Pivote: -42

array[0] = 9 <==> array[1](Pivote) = -42 

****************

Array Ordenada = [-42, 9, 15, 42, 78, 1764]




"""