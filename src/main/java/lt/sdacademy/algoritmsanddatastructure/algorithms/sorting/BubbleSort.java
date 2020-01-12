/*package lt.sdacademy.algoritmsanddatastructure.algorithms.sorting;

import static lt.sdacademy.algoritmsanddatastructure.algorithms.sorting.InsertionSort.sort;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {0, 5, 2, 3, 15, 1, 0, 45, 7, 78, 8};
        int[] sortedArr = sort(arr);

        for (int element : sortedArr) {
            System.out.println(element);
        }
        private static int[] sort ( int[] arr){
            int arrayLengt = arr.length;
            for (int i = 0; i < arrayLengt; i++) {
                for (int j = 0; j < arrayLengt - 1 - i; j++) {
                    int element = arr[j];
                    if (arr[j] > arr[j + 1]) {
                        arr[j] = arr[j + 1];
                        arr[j + 1] = element;
                    }
                }
            }
            return arr;
        }
    }
}*/

