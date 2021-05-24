package com.nacho;


import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	int [] array = {15,23,95,8,63,321,1786,-523,42};
	var quickSort = new QuickSort();
	var binarySearch = new BinarySearch();
	var insertion_Sort = new InsertionSort();
	quickSort.quickSort(array, 0, array.length-1);
		//System.out.println(Arrays.toString(array));
//		binarySearch.binarySearch(array, 321, 0, array.length-1);
//
	int [] array2 = {115,23,95,8,63,321,-523,42};
		System.out.println("*** Insertion Sort ***");
	insertion_Sort.insertionSort(array2, 0);
//
//		System.out.println(Arrays.toString(array2));
    }

}
/*
				*-*-*-*-*-*-*-* RESULTADO *-*-*-*-*-*-

Array = [15, 23, 95, 8, 63, 321, 1786, -523, 42]

*** i menor a j ***

Pivot = 42

array[2] = 95 <==> array[7] = -523

Array = [15, 23, -523, 8, 63, 321, 1786, 95, 42]

*** j mayor a i ***

Pivot = 42

array[4] = 63 <==> array[8](Pivot) = 42

Array = [15, 23, -523, 8, 42, 321, 1786, 95, 63]

*** i menor a j ***

Pivot = 8

array[0] = 15 <==> array[2] = -523

Array = [-523, 23, 15, 8, 42, 321, 1786, 95, 63]

*** j mayor a i ***

Pivot = 8

array[1] = 23 <==> array[3](Pivot) = 8

Array = [-523, 8, 15, 23, 42, 321, 1786, 95, 63]
Array = [-523, 8, 15, 23, 42, 321, 1786, 95, 63]

*** j mayor a i ***

Pivot = 63

array[5] = 321 <==> array[8](Pivot) = 63

Array = [-523, 8, 15, 23, 42, 63, 1786, 95, 321]

*** i menor a j ***

Pivot = 321

array[6] = 1786 <==> array[7] = 95

Array = [-523, 8, 15, 23, 42, 63, 95, 1786, 321]

*** j mayor a i ***

Pivot = 321

array[7] = 1786 <==> array[8](Pivot) = 321

[-523, 8, 15, 23, 42, 63, 95, 321, 1786]
[-523, 8, 15, 23, 42, 63, 95, 321, 1786]
Se buscará desde -523, hasta 1786

El valor medio será: 42

[-523, 8, 15, 23, 42, 63, 95, 321, 1786]
Se buscará desde 63, hasta 1786

El valor medio será: 95

[-523, 8, 15, 23, 42, 63, 95, 321, 1786]
Se buscará desde 321, hasta 1786

El valor medio será: 321

Se encontró en array[7]
 */