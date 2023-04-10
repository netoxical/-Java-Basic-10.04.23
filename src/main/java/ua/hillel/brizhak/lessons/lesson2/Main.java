package ua.hillel.brizhak.lessons.lesson2;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {

//        byte age;
//        age = 24;
//        System.out.println(age);
//
//        short shortVariable = 32500;
//
//        int intVariable = 2_077_255_123;
//
//        long longVariable = 4_512_312_123_312L;
//
//        System.out.println(longVariable);
//
//
//
//        Float floatVariable = 10.5710239821095712F;
//        double doubleVariable = 10.5710239821095712;
//
//        System.out.println(floatVariable);
//        System.out.println(doubleVariable);
//
//
//
//        char symbolA = 'A';
//        char symbolA2 = 65;
//        char symbolA3 = '\u0041';
//
//        System.out.println(symbolA);
//        System.out.println(symbolA2);
//        System.out.println(symbolA3);
//
//
//        boolean booleanVariableTrue = true;
//        boolean booleanVariableFalse = false;
//
//        System.out.println(booleanVariableTrue);
//        System.out.println(booleanVariableFalse);


//        String str = "Hello";
//
//        System.out.println("Hello" + "World");
//
//        System.out.println(str);
//        System.out.println(str);
//        System.out.println(str);
//        System.out.println(str);
//
//        System.out.println(str + "World" + 10 + 15);
//        System.out.println("XXX" + 10 + 15);
//        System.out.println("XXX" + (10 + 15));
//
//        System.out.println(str + " World");


//        int a = 10;
//        Integer b = 10;
//
//        char c = "B";
//        Character d = "B";

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);


        byte byteVariable = 50;
        short shortVariable = byteVariable;

        System.out.println(shortVariable);

        byte byteVariable2 = 50;
        long longVariable2 = byteVariable2;
        double doubleVariable2 = byteVariable2;

        System.out.println(longVariable2);
        System.out.println(doubleVariable2);


        int age2 = 28;
        byte byteAge = (byte) age2;

        System.out.println(byteAge);


        System.out.println((byte) 126);
        System.out.println((byte) 127);
        System.out.println((byte) 128);
        System.out.println((byte) 129);
        System.out.println((byte) 130);


        final double PI_VALUE = 3.14159265358979323846;

        System.out.println(PI_VALUE);

        BigDecimal bigDecimal = new BigDecimal(3.14159265358979323846);
        System.out.println(bigDecimal);


        System.out.println((int) 55.88);
        System.out.println((double) 7);


    }
}
