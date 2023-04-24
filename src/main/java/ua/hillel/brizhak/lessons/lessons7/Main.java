package ua.hillel.brizhak.lessons.lessons7;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        int[] array = new int[5];
//        int[] array = {1, 55, 123, 25, 77};
//        int[] array = new int[] {1, 55, 123, 25, 77};
//        int[] array = new int[-1]; так нельзя делать
//        int[] array = new int[0];
//        array[0] = 9;
//        array[1] = 1;
//        array[2] = 2;
//        array[3] = 3;
//        array[4] = 4;

//        System.out.println(array[0]);
//        System.out.println(array[1]);
//        System.out.println(array[2]);
//        System.out.println(array[3]);
//        System.out.println(array[4]);

//        for (int i = 0; i < array.length; i++) {
//            if (array[i] == 3 || array[i] == 4) {
//                array[i] = 77;
//            }
//            System.out.println(array[i]);
//        }

//        for (int value : array) {
//            System.out.println(value);
//        }

//        System.out.println(Arrays.toString(array));


//        int[] array = new int[10];
//        array[0] = (int) Math.random() * 11;
//
//        for (int i = 0; i < array.length; i++) {
//            array[i] = (int) (Math.random() * 11);
//        }
//
//        for (int i = 0; i < array.length; i++) {
//            if (array.length - 1 == i) {
//                System.out.print(array[i]);
//            } else {
//                System.out.print(array[i] + ", ");
//            }
//        }



//        int [] people = {11, 44, 98, 44, 22, 33, 55, 22, 98, 6};
//        int max = people[0];
//        for (int i = 0; i < people.length; i++) {
//            max = Math.max(max, people[i]);
//        }
//        for (int i = 0; i < people.length; i++) {
//            if (max == people[i]) {
//                System.out.println("chance " + max + ", index: " + i);
//        }
//        }


//        int[] people = new int[10];
//
//        for (int i = 0; i < people.length; i++) {
//            people[i] = (int) (Math.random() * 101);
//        }
//        System.out.println(Arrays.toString(people));
//
//        int max = people[0];
//        for (int i = 0; i < people.length; i++) {
//            if (max < people[i]) {
//                max = people[i];
//            }
//            max = Math.max(max, people[i]);
//        }
//
//        System.out.println("max chance = " + max);


        int[] array1 = {1, 2, 3, 4, 5};
//        int[] array2 = array1; не правильно
        int[] array2 = new int[array1.length];
        for (int i = 0; i < array1.length; i++) {
            array2[i] = array1[i];
        }
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
        array2[0] = 99;
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));



































    }
}
