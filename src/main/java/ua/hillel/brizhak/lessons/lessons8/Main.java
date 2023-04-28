package ua.hillel.brizhak.lessons.lessons8;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

//        // O (N)
//        for (int i = 0; i < 5; i++) {
//        }
//
//        int counter = 0;
//        // O ( N^2)
//        for (int i = 0; i < 15; i++) {
//            for (int j = 0; j < 12; j++) {
//                counter++;
//            }
//        }
//        System.out.println("couner = " + counter);
//
//        int counter1 = 0;
//        // O ( N^3)
//        for (int i = 0; i < 15; i++) {
//            for (int j = 0; j < 12; j++) {
//                for (int k = 0; k < 3; k++) {
//                    counter1++;
//                }
//
//            }
//        }
//        System.out.println("couner = " + counter1);


        // сортировка
//        int counter = 0;
//        int[] array = {5, 1, 2, 5, 76, 23, 2, 6, 87};
////        int[] array = {1, 2, 2, 5, 5, 6, 23, 76, 87};
//        for (int i = 0; i < array.length - 1; i++) {
//            for (int j = 0; j < array.length - 1 - i; j++) {
//                counter++;
//                if (array[j] > array[j + 1]) {
//                    int temp = array[j];
//                    array[j] = array[j + 1];
//                    array[j + 1] = temp;
//                }
//            }
//        }
//        System.out.println(Arrays.toString(array));
//        System.out.println("counter = " + counter);

        //сортировка 2

        int[] array = {5, 1, 2, 5, 76, 23, 2, 6, 87};
        boolean swapped = true;
        int start = 0;
        int end = array.length;
        int counter = 0;
        while (swapped == true) {
            swapped = false;
            for (int i = start; i < end - 1; ++i) {
                counter++;
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    swapped = true;
                }
            }

            if (swapped == false) {
                break;
            }

            swapped = false;

            end = end - 1;

            for (int i = end - 1; i >= start; i--) {
                counter++;
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    swapped = true;
                }
            }

            start = start + 1;
        }
//
        System.out.println("counter = " + counter);
        System.out.println(Arrays.toString(array));


//        Integer[] array = {5, 1, 2, 5, 76, 23, 2, 6, 87};
//        Arrays.sort(array);
//        System.out.println(Arrays.toString(array));
//
//
//        Arrays.sort(array, Collections.reverseOrder());
//        System.out.println(Arrays.toString(array));


//        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        int element = 9;
//        int index = -1;
//        int counter = 0;
        // поиск по порядку с 1
//        for (int i = 0; i < array.length; i++) {
//            counter++;
//            if (array[i] == element) {
//                index = i;
//            break;
//        }
//    }

        // поиск с /2 и откидыванием не подходящего работает только с отсортироваными масивами O(logN)
//        int firstIndex = 0;
//        int secondIndex = array.length - 1;
//
//        while (firstIndex <= secondIndex) {
//            counter++;
//            int middleIndex = ((firstIndex + secondIndex) / 2);
//            if (array[middleIndex] == element) {
//                index = middleIndex;
//                break;
//            } else if (array[middleIndex] < element) {
//                firstIndex = middleIndex + 1;
//            } else {
//                secondIndex = middleIndex - 1;
//            }
//
//        }
//
//        System.out.println("counter = " + counter);
//        System.out.println("index = " + index);

//        int indexArray = Arrays.binarySearch(array, element);
//        System.out.println("undex = " + indexArray);


//        int[] array = {1, 2, 3, 4, 5};
//        int[] array2 = Arrays.copyOf(array, array.length);
//        System.out.println(Arrays.toString(array2));























    }
}






















