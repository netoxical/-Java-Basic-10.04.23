package ua.hillel.brizhak.homeworks.Homework16;

public class Main {
    public static void main(String[] args) {

        IPhones iPhones = new IPhones("iPhone 12");
        iPhones.call();
        iPhones.sms();
        iPhones.internet();
        iPhones.applePay();

        System.out.println();

        Androids androids = new Androids("Samsung");
        androids.call();
        androids.sms();
        androids.internet();
        androids.telegram();




    }
}
