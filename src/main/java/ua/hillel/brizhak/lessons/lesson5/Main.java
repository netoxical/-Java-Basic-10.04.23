package ua.hillel.brizhak.lessons.lesson5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//
//        int age1 = 21;
//        int age2 = 17;
//        int age3 = 19;
//        int age4 = 25;
//
//        boolean result = age1 >= 23 && age2 >= 23 && age3 >= 23 && age4 >= 23 &&;
//        System.out.println(result);


//        int a = 30;
//        int b = 20;
//
//        if (a <= b) {
//            System.out.println("a <= b");
//            if (a < b) {
//                System.out.println("a < b");
//            } else {
//                System.out.println("a == b");
//            }
//        }

//        int a = 5;
//        int b = 7;
//        int c = 10;
//
//        boolean result = a < b && b > c;
//        boolean result1 = a > b || b > c;
//
//        System.out.println(result);
//        System.out.println(result1);

//        int a = 30;
//        int b = 30;
//
////        if (a != b) {
////            System.out.println("1");
////        }
////            System.out.println("2");
////            System.out.println("3");
////            System.out.println("4");


//        (?????) ?  ????? 1 : ????? 2 ->  ???? ? ?? 1 ?????? ?? 2

//        int a = 20;
//        int b = 10;
//
//        if (a >= b) {
//            System.out.print("YES ");
//            if (a == b) {
//                System.out.println("a = b");
//            } else {
//                System.out.println("a > b");
//            }
//        } else {
//            System.out.println("NO");
//        }
//
//        System.out.println((a > b) ? "YES" : "NO");
//        System.out.println((a > b) ? "YES " + ((a == b) ? "a = b" : "a > b") : "NO");


//        SWITCH

//        int a = 3;

//        if (a == 1) {
//            System.out.println("1");
//        } else if (a == 2) {
//            System.out.println("2");
//        } else if (a == 3) {
//            System.out.println("3");
//        } else if (a == 4) {
//            System.out.println("4");
//        } else if (a == 5) {
//            System.out.println("5");
//        } else {
//            System.out.println("defoult");
//        }



//        switch (a) {
////            default: {
////                System.out.println("default");
////            }
//            case 1: {
//                System.out.println("1");
//                break;
//            }
//            case 2: {
//                System.out.println("2");
//                break;
//            }
//            case 3: {
//                System.out.println("3");
//                break;
//            }
//            case 4: {
//                System.out.println("4");
//                break;
//            }
//            case 5: {
//                System.out.println("5");
//                break;
//            }
//            default: {
//                System.out.println("default");
//                break;
//            }


//        switch (a) {
////            default: {
////                System.out.println("default");
////            }
//            case 1: {
//                System.out.println("1");
//                break;
//            }
//            case 2: {
//                System.out.println("2");
//                break;
//            }
//            case 3: {
//                System.out.println("3");
//                break;
//            }
//            case 4: {
//                System.out.println("4");
//                break;
//            }
//            case 5: {
//                System.out.println("5");
//                break;
//            }
//            default: {
//                System.out.println("default");
//                break;
//            }
//        }

//        String str = "qwe";
//
//        switch (str) {
//            case "qwe": {
//                System.out.println("1");
//                break;
//            }
//            case "qWE": {
//                System.out.println("2");
//                break;
//            }
//            case "QWe": {
//                System.out.println("3");
//                break;
//            }
//            case "QWE": {
//                System.out.println("4");
//                break;
//            }
//        }


//        System.out.println((str.equalsIgnoreCase("Qwe")));
//        System.out.println((str.equals("Qwe")));

        // SCANNER

        Scanner sc = new Scanner (System.in);
//        String userValue = sc.next(); //?????? ????? ? ???????
//        String userValue = sc.nextLine(); // ???? ??? ? ???????
//        System.out.println("userValue =" + userValue);
//
//        String userValue2 = sc.next();
//        System.out.println("userValue2 =" + userValue2);

        int intengerUserValue = 0;
        if(sc.hasNextInt()) {
            intengerUserValue = sc.nextInt();
            sc.nextLine();
        } else {
            System.out.println("Wrong Data! Try again!");
            System.exit(0);
        }
        System.out.println("intengerUserValue = " + intengerUserValue); //?????? ???? ? ??????? IF

        int valume1 = sc.nextInt();
        int valume2 = sc.nextInt();
        int valume3 = sc.nextInt();

        System.out.println("valume1 =" + valume1);
        System.out.println("valume2 =" + valume2);
        System.out.println("valume3 =" + valume3);
        sc.nextLine();

        String strUserValume = sc.nextLine();
        System.out.println("strUserValume = " + strUserValume);

























    }
}
