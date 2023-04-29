package ua.hillel.brizhak.homeworks.Homework10;
import java.util.Arrays;
import java.util.Scanner;

public class Homework10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] randomLottery = new int [7];
        int[] userLottery = new int [7];
        System.out.println("Greetings! Enter " + userLottery.length + " numbers from 0 to 9");
        for (int i = 0; i < userLottery.length; i++) {
            if (scanner.hasNextInt()) {
                int userValume = scanner.nextInt();
                if (userValume <= 9 && userValume >= 0) {
                    userLottery[i] = userValume;
                } else if (userValume > 9 || userValume < 0) {
                    i = i - 1;
                    System.out.println("Try to guess the number from 0 to 9");
                }
                } else {
                    i = i - 1;
                    System.out.println("wrong data! try again");
                }
                scanner.nextLine();
            }
        System.out.println("user numbers = " + Arrays.toString(userLottery));

        for (int i = 0; i < randomLottery.length; i++) {
            randomLottery[i] = (int) (Math.random() * 10);
        }
        System.out.println("lottery numbers = " + Arrays.toString(randomLottery));

        boolean swapped = true;
        boolean swapped1 = true;
        int start = 0;
        int start1 = 0;
        int end = randomLottery.length;
        int end1 = userLottery.length;
        while (swapped == true) {
            swapped = false;
            for (int i = start; i < end - 1; i++) {
                if (randomLottery[i] > randomLottery[i + 1]) {
                    int temp = randomLottery[i];
                    randomLottery[i] = randomLottery[i + 1];
                    randomLottery[i + 1] = temp;
                    swapped = true;
                }
                if (swapped = false) {
                    break;
                }
            }
                swapped = false;
                end = end - 1;
                for (int i = end - 1; i >= start; i--) {
                    if (randomLottery[i] > randomLottery[i + 1]) {
                        int temp = randomLottery[i];
                        randomLottery[i] = randomLottery[i + 1];
                        randomLottery[i + 1] = temp;
                        swapped = true;
                    }
                }
            start = start + 1;
            }
        while (swapped1 == true) {
            swapped1 = false;
            for (int i = start1; i < end1 - 1; i++) {
                if (userLottery[i] > userLottery[i + 1]) {
                    int temp = userLottery[i];
                    userLottery[i] = userLottery[i + 1];
                    userLottery[i + 1] = temp;
                    swapped1 = true;
                }
                if (swapped1 = false) {
                    break;
                }
            }
            swapped1 = false;
            end1 = end1 - 1;
            for (int i = end1 - 1; i >= start1; i--) {
                if (userLottery[i] > userLottery[i + 1]) {
                    int temp = userLottery[i];
                    userLottery[i] = userLottery[i + 1];
                    userLottery[i + 1] = temp;
                    swapped1 = true;
                }
            }
            start1 = start1 + 1;
        }
        System.out.println("sorted user numbers = " + Arrays.toString(userLottery));
        System.out.println("sorted lottery numbers = " + Arrays.toString(randomLottery));
        
        int index = 0;
        int counter = 0;
        for (int i = 0; i < userLottery.length; i++) {
            if (userLottery[i] == randomLottery[i]) {
                index++;
                counter++;
                System.out.println("match in " + index + "th position");
            } else {
                index++;
                continue;
            }
        }

        if (counter == 0) {
            System.out.println("You have 0 matches!!! better luck next time!!!");
        } else if (counter == 7) {
            System.out.println("Congratulations!!!!!!! Jackpot!!!!! You have " + counter + " matches");
        } else {
            System.out.println("Congratulations you have " + counter + " matches");
        }
























    }
}
