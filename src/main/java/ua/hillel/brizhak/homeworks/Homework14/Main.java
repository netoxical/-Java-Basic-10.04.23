package ua.hillel.brizhak.homeworks.Homework14;

import ua.hillel.brizhak.lessons.lessons12.Cat;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        PersonInfo firstInfo = new PersonInfo("Верес",
                1998,
                "veres1077@gmail.com",
                380672189132L,
                "Дорогосил",
                70,
                100,
                10000);
        firstInfo.setDaySteps(12000);
        firstInfo.setPressure(110);
        firstInfo.setWeight(75);
        firstInfo.setSurname("Варфоломій");
        firstInfo.printAccountInfo();

        PersonInfo secondInfo = new PersonInfo("Середа",
                1998,
                "sereda39993999@gmail.com",
                380651239121L,
                "Йозеф",
                80,
                120,
                12000);
        secondInfo.setDaySteps(10000);
        secondInfo.setPressure(100);
        secondInfo.setWeight(85);
        secondInfo.setSurname("Живослав");
        secondInfo.printAccountInfo();

        PersonInfo thirdInfo = new PersonInfo("Хміль",
                1998,
                "hmil123@gmail.com",
                380671239123L,
                "Зборислав",
                90,
                90,
                15000);
        thirdInfo.setDaySteps(12000);
        thirdInfo.setPressure(100);
        thirdInfo.setWeight(90);
        thirdInfo.setSurname("Устим");
        thirdInfo.printAccountInfo();

    }
}
