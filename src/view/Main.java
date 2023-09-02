package view;

import br.edu.fateczl.algoritmos.quicksort.QuickSort;

public class Main {

    public static void main(String[] args) {

        int[] array1 = {74, 20, 74, 87, 81, 16, 25, 99, 44, 58};
        int[] array2 = {44, 43, 42, 41, 40, 39, 38};
        int[] array3 = {31, 32, 33, 34, 99, 98, 97, 96};

        QuickSort sort = new QuickSort();

        array1 = sort.QuickSort(array1, 0, array1.length - 1);
        array2 = sort.QuickSort(array2, 0, array2.length - 1);
        array3 = sort.QuickSort(array3, 0, array3.length - 1);

        System.out.println("----- #1 Array -----");
        for(int i : array1){
            System.out.print(i + " | ");
        }

        System.out.println("\n----- #2 Array -----");
        for(int i : array2){
            System.out.print(i + " | ");
        }

        System.out.println("\n----- #3 Array -----");
        for(int i : array3){
            System.out.print(i + " | ");
        }
    }
}
