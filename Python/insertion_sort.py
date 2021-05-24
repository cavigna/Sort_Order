import random
def insertion_sort(array:list, stop=0):
    if stop== len(array)-3:
        return array
    print(f'{stop} Iteracion = {array}')
    print('')
    
    for i in range(1,len(array)):
        if array[i]<array[i-1] :
            array[i], array[i-1] = array[i-1], array[i]
            
        
            
            
    return insertion_sort(array, stop+1)    

arr = [38, 15,12453, 23, 63, -523, 42, 95, 321, 1786, -323,7]
print(f'Array original = {arr}')
print()
insertion_sort(array=arr)
print(f'Array Ordenada = {arr}')


""" Resultado
Array original = [38, 15, 12453, 23, 63, -523, 42, 95, 321, 1786, -323, 7]

0 Iteracion = [38, 15, 12453, 23, 63, -523, 42, 95, 321, 1786, -323, 7]   

1 Iteracion = [15, 38, 23, 63, -523, 42, 95, 321, 1786, -323, 7, 12453]   

2 Iteracion = [15, 23, 38, -523, 42, 63, 95, 321, -323, 7, 1786, 12453]   

3 Iteracion = [15, 23, -523, 38, 42, 63, 95, -323, 7, 321, 1786, 12453]   

4 Iteracion = [15, -523, 23, 38, 42, 63, -323, 7, 95, 321, 1786, 12453]   

5 Iteracion = [-523, 15, 23, 38, 42, -323, 7, 63, 95, 321, 1786, 12453]   

6 Iteracion = [-523, 15, 23, 38, -323, 7, 42, 63, 95, 321, 1786, 12453]   

7 Iteracion = [-523, 15, 23, -323, 7, 38, 42, 63, 95, 321, 1786, 12453]   

8 Iteracion = [-523, 15, -323, 7, 23, 38, 42, 63, 95, 321, 1786, 12453]   

Array Ordenada = [-523, -323, 7, 15, 23, 38, 42, 63, 95, 321, 1786, 12453]
"""