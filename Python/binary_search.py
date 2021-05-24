def binary_search(array: list, valor_buscado, inicio=0, fin=None):
    if fin == None:
        fin = len(array)-1

    if inicio > fin:
        return f"No se encontró el valor: {valor_buscado}"
    medio = (inicio + fin)//2

    if valor_buscado == array[medio]:
        return f"El valor {valor_buscado} está el indice {medio} "

    if valor_buscado < array[medio]:
        return binary_search(array, valor_buscado, inicio, medio-1)
        
    return binary_search(array, valor_buscado, medio+1, fin)


array = [-23, 4, 7, 12, 52, 94]

print(binary_search(array, 0)) #No se encontró el valor: 0
print(binary_search(array, 52))# Encontrado en el indice 4 
