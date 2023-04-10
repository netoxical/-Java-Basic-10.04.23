package ua.hillel.brizhak.homeworks.homework2;

public class Homework2 {
    public static void main(String[] args) {
        char specSymbol = '\u00B0';
        System.out.println("Latitude: 34.967167 Longitude: 135.772933");
        System.out.println("Location: 34° 58' 1.80'' N, 135° 46' 22.56'' E");
        System.out.println("Location: 34" + specSymbol + " 58' 1.80'' N, 135° 46' 22.56'' E");


    }
}
