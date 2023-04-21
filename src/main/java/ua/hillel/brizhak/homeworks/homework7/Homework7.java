package ua.hillel.brizhak.homeworks.homework7;

import java.util.Scanner;

public class Homework7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Greetings! Try to guess the number from 0 to 10. You have 3 attempts");
        int j = 11;
        for (int i = 0; i < 3; i++) {
            int random = (int) (Math.random() * j);
            int userValue = scanner.nextInt();
            if (userValue == random) {
                System.out.println("Graz!!! That number was " + random + "!!!");
                break;
            } else if (userValue != random && i == 0) {
                System.out.println("Wrong!! Try again. 2 tries left");
            } else if (userValue != random && i == 1) {
                System.out.println("Wrong!! Try again. 1 tries left");
            } else if (userValue != random && i == 2) {
                System.out.println("Wrong!! You lost the game. Try again later)");
            }
        }

    }
}

