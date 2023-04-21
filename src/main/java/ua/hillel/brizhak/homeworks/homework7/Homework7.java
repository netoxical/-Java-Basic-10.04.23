package ua.hillel.brizhak.homeworks.homework7;

import java.util.Scanner;

public class Homework7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);

        System.out.println("Greetings! Try to guess the number from 0 to 10. You have 3 attempts");
        int j = 11;
        int random = (int) (Math.random() * j);
        int n = 5;
        int b = n - 1;
        int a = 0;
        for (int i = 0; i < n; i++, a++ , b--) {
            int userValue = scanner.nextInt();
                if (userValue == random) {
                    System.out.println("Graz!!! That number was " + random + "!!!");
                    break;
                } else if (userValue > 10) {
                    b = b + 1;
                    i = i - 1;
                    a = a - 1;
                    System.out.println("Try to guess the number from 0 to 10");
                } else if (userValue != random && i == n - 1) {
                    System.out.println("Wrong!! You lost the game. Try again later)");
                } else if (userValue != random && i == a) {
                    a = a++;
                    System.out.println("Wrong!! Try again. " + b + " tries left");
                }
//            System.out.println(random);
            }
        }
    }

