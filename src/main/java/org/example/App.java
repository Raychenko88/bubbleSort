package org.example;


import java.util.Arrays;

public class App {
    public static void main( String[] args ) {
       int[] arrUnsorted = {2,4,6,8,1,3,5,7};
        System.out.println(Arrays.toString(bubbleSort(arrUnsorted)));
    }

    private static int[] bubbleSort(int[] arrToSort) {

        // Проходим по массиву
        // Сравниваем 2 соседних элемента
        // Повторять эти действия пока массив не будет реализован
        int count;
        do {
            count = 0;
            for (int i = 0; i < arrToSort.length - 1; i++) {
                if (arrToSort[i] > arrToSort[i + 1]) {
                    int temp = arrToSort[i];
                    arrToSort[i] = arrToSort[i + 1];
                    arrToSort[i + 1] = temp;
                    count++;
                }
            }
        } while (count > 0);
        return arrToSort;
    }
}
