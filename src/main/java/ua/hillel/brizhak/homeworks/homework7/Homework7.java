package ua.hillel.brizhak.homeworks.homework7;

import java.util.Scanner;

public class Homework7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int j = 11;
        int random = (int) (Math.random() * j);
        int n = 7;
        int b = n - 1;
        int a = 0;
        System.out.println("Greetings! Try to guess the number from 0 to 10. You have " + n + " attempts");
        for (int i = 0; i < n; i++, a++, b--) {
            if (scanner.hasNextInt()) {
                int userValume = scanner.nextInt();
                if (userValume == random) {
                    System.out.println("Graz!!! That number was " + random + "!!!");
                    break;
                } else if (userValume > 10 || userValume < 0) {
                    b = b + 1;
                    i = i - 1;
                    a = a - 1;
                    System.out.println("Try to guess the number from 0 to 10");
                } else if (userValume != random && i == n - 1) {
                    System.out.println("Wrong!! You lost the game. Try again later)");
                } else if (userValume != random && i == a) {
                    a = a++;
                    System.out.println("Wrong!! Try again. " + b + " tries left");
                }
            System.out.println(random);
            } else {
                b = b + 1;
                i = i - 1;
                a = a - 1;
                System.out.println("wrong data! try again");
            }
            scanner.nextLine();
        }



    }
}


