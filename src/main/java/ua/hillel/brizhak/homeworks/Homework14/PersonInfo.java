package ua.hillel.brizhak.homeworks.Homework14;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PersonInfo {

//    Scanner scanner = new Scanner(System.in);
    private String name;
    private int date;
    private String email;
    private long number;
    String surname;
    int weight;
    int pressure;
    int daySteps;

    public String getName() {
        return name;
    }

    public int getDate() {
        return date;
    }

    public String getEmail() {
        return email;
    }

    public long getNumber() {
        return number;
    }

    public String getSurname() {
        return surname;
    }

    public int getWeight() {
        return weight;
    }

    public int getPressure() {
        return pressure;
    }

    public int getDaySteps() {
        return daySteps;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setPressure(int pressure) {
        this.pressure = pressure;
    }

    public void setDaySteps(int daySteps) {
        this.daySteps = daySteps;
    }

    public  PersonInfo(String name, int date, String email, long number, String surname, int weight, int pressure, int daySteps) {
        this.name = name;
        this.date = 2023 - date;
        this.email = email;
        this.number = number;
        this.surname = surname;
        this.weight = weight;
        this.pressure = pressure;
        this.daySteps = daySteps;
    }

    void printAccountInfo() {
        System.out.println(name + " "
        + surname + " " + date + "років" + '\n'
        + "вага: " + weight + "кілограм" + '\n'
        + "тиск: " + pressure + '\n'
        + "кроків на день: " + daySteps + '\n'
        + "email: " + email + '\n'
        + "номер телефона: " + number);
        System.out.println();
    }

}
