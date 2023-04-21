package ua.hillel.brizhak.lessons.lessons6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        int i = 0;
//        for (int i = 0; i < 5; i++) {
//            System.out.println(i);
//        }

//        for (int i = 1; ; i++) {
//            if (i > 10) {
//                break;
//            }
//            System.out.println(i);
//        }

//        for (int i = 1; i < 10; i++) {
//            if (i == 5 || i == 6){
//                continue;
//            }
//            System.out.println(i);
//        }


//        for (int i = 0; i < 21; i++) {
//            if (i % 2 != 0) {
//                continue;
//            }
//            System.out.println(i);
//        }

//        int num1 = 1;
//        int num2 = 1;
//        int sum;
//
//        System.out.print(num1 + " " + num2 + " ");
//
//        for (int i = 0; i < 9; i++) {
//            sum = num1 + num2;
//            System.out.print(sum + " ");
//            num1 = num2;
//            num2 = sum;
//        }

//        for (int i = 0, j = 10; i < 10 && j > 5; i++, j--) {
//            System.out.println("i = " + i);
//            System.out.println("j = " + j);
//            System.out.println();
//            System.out.println();
//
//        }


//        int i = -1;
//        while (true) {
//            i++;
//            if (i == 5) {
//                continue;
//            }
//            if (i > 51) {
//                break;
//            }
//            System.out.println(i);
//        }

//        int i = 0;
//        do {
//            System.out.println("YES");
//            i++;
//        } while (i < 4);

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Please enter integer");
//        while (true) {
//            if (scanner.hasNextInt()) {
//                int userValume = scanner.nextInt();
//                System.out.println("user value = " + userValume);
//                break;
//            } else {
//                System.out.println("wrong data! try again");
//                scanner.nextLine();
//            }
//        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter integer");
        while (true) {
            if (scanner.hasNextInt()) {
                int userValume = scanner.nextInt();
                if (userValume >= 10 && userValume <= 20) {
                    System.out.println("user value = " + userValume);
                    break;
                } else {
                    System.out.println("from 10 to 20");
                }
            } else {
                System.out.println("wrong data! try again");
            }
            scanner.nextLine();
        }

//        int time = 10;
//        while (true) {
//            int random = (int) (Math.random() * 101);
//            if (random >=85 && random <=100) {
//                System.out.println("WIN!!!!!!!!!!");
//                break;
//            }
//            System.out.println(time);
//            if (time == 0) {
//                System.out.println("BOOOOOOOOOOOM");
//                break;
//            }
//            time--;
//        }


        int chance = 101;
        int j = 0;

        for (int i = 0; i < 100; i++) {
            j++;
            int random = (int) (Math.random() * chance);
            System.out.println("random = " + random);

            if (random == 0 || random == 1) {
                System.out.println("JACKPOT");
                break;
            }

            if (j == 10) {
                chance -= 10;
                j = 0;
            }
        }

















    }
}
