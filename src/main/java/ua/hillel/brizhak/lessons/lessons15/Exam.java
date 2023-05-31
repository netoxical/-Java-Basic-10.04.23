package ua.hillel.brizhak.lessons.lessons15;

import java.util.Arrays;
import java.util.Scanner;

public class Exam {
    public static void main(String[] args) {
        runApp();



    }

    static void runApp() {
        Scanner scanner = new Scanner(System.in);
        CarType[] carTypes = CarType.values();
        CarType userCarType = null;
        while (userCarType == null) {
            System.out.println("Enter car type form list " + Arrays.toString(carTypes));
            String userValue = scanner.nextLine().toUpperCase();
            for (CarType carType: carTypes) {
                if (userValue.equals(carType.toString())) {
                    userCarType = CarType.valueOf(userValue);
                    break;
                }
            }
        }
        System.out.println(userCarType);

        switch (userCarType) {
            case CAR: {
                System.out.println("for " + CarType.CAR + " need category " + Category.B);
                break;
            }
            case BUS: {
                System.out.println("for " + CarType.BUS + " need category " + Category.D);
                break;
            }
            case TRACK: {
                System.out.println("for " + CarType.TRACK + " need category " + Category.C);
                break;
            }
            case BIKE: {
                System.out.println("for " + CarType.BIKE + " need category " + Category.A);
                break;
            }
        }
    }












}
