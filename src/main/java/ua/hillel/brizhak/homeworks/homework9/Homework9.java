package ua.hillel.brizhak.homeworks.homework9;

import java.util.Arrays;

public class Homework9 {
    public static void main(String[] args) {

        int[] team1 = new int[25];
        int[] team2 = new int[25];
        int min = 18;
        int max = 45;
        int team1Age = 0;
        int team2Age = 0;
        System.out.print("Team1 = ");
        for (int i = 0; i < team1.length; i++) {
            team1[i] = (int) ((Math.random() * (max - min + 1)) + min);
            team2[i] = (int) ((Math.random() * (max - min + 1)) + min);
            if (team1.length - 1 == i) {
                System.out.print(team1[i] + "\n");
                team1Age = team1Age + team1[i];
                System.out.println("Team 1 age = " + team1Age);
                System.out.println("Avarage age 1 team = " + (double) team1Age / team1.length);
            } else {
                System.out.print(team1[i] + ", ");
                team1Age = team1Age + team1[i];
            }
        }
        System.out.print("Team2 = ");
        for (int i = 0; i < team2.length; i++) {
            team1[i] = (int) ((Math.random() * (max - min + 1)) + min);
            team2[i] = (int) ((Math.random() * (max - min + 1)) + min);
            if (team2.length - 1 == i) {
                System.out.print(team2[i] + "\n");
                team2Age = team2Age + team2[i];
                System.out.println("Team 2 age = " + team2Age);
                System.out.println("Avarage age 2 team = " + (double) team2Age / team2.length);
            } else {
                System.out.print(team2[i] + ", ");
                team2Age = team2Age + team2[i];
            }
        }


        /*
        for (int i = 0; i < team1.length; i++) {
            team1[i] = (int) ((Math.random() * (max - min + 1)) + min);
            team2[i] = (int) ((Math.random() * (max - min + 1)) + min);
            if (team1.length - 1 == i) {
                team1Age = team1Age + team1[i];
                team2Age = team2Age + team2[i];
            } else {
                team1Age = team1Age + team1[i];
                team2Age = team2Age + team2[i];
            }
        }
        String str1 = Arrays.toString(team1);
        String str2 = Arrays.toString(team2);
        System.out.println("Team 1 = " + str1);
        System.out.println("Team 1 age = " + team1Age);
        System.out.println("Avarage age 1 team = " + (double) team1Age / team1.length);
        System.out.println("Team 2 = " + str2);
        System.out.println("Team 2 age = " + team2Age);
        System.out.println("Avarage age 2 team = " + (double) team2Age / team2.length);
        */ // это второй вариант но тут в перечеслении возраста есть скобки




        if ((double) team2Age / team2.length > (double) team1Age / team2.length) {
            System.out.println("Team 2 is older than team 1");
        } else if ((double) team2Age / team2.length < (double) team1Age / team2.length) {
            System.out.println("Team 1 is older than team 2");
        } else {
            System.out.println("DRAW");
        }







    }
}
