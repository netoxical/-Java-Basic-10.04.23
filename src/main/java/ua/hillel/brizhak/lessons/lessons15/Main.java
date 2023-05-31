package ua.hillel.brizhak.lessons.lessons15;

import ua.hillel.brizhak.lessons.lessons14.Classes.Car;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        System.out.println(CarTypeClass.CAR.getType());
//        System.out.println(CarType.CAR.getType());
//
//        CarType[] values = CarType.values();
//        for (CarType value : values) {
//            System.out.println(value.getType());
//        }
//
//        CarType car = CarType.valueOf("CAR");
//        System.out.println(car);

        CarType[] carTypes = CarType.values();
        Scanner scanner = new Scanner(System.in);
        CarType userCarType = null;
        while (userCarType == null) {
            System.out.println("Enter car type form list " + Arrays.toString(carTypes));
            String userValue = scanner.nextLine();
            for (CarType carType : carTypes) {
                if (userValue.equals(carType.toString())) {
                 userCarType = CarType.valueOf(userValue);
                 break;
                }
            }
        }


        switch (userCarType) {
            case CAR: {
                System.out.println(CarType.CAR.getType());
                break;
            }
            case BUS: {
                System.out.println(CarType.BUS.getType());
                break;
            }
            case TRACK:CK: {
                System.out.println(CarType.TRACK.getType());
                break;
            }
            case BIKE: {
                System.out.println(CarType.BIKE.getType());
                break;
            }
        }






    }
}
