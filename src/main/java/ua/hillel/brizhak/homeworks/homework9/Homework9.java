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
            } else {
                System.out.print(team1[i] + ", ");
                team1Age = team1Age + team1[i];
            }
        }
        System.out.println(team1Age);
        System.out.println((double) team1Age / team1.length);




        System.out.print("Team2 = ");
        for (int i = 0; i < team2.length; i++) {
            team1[i] = (int) ((Math.random() * (max - min + 1)) + min);
            team2[i] = (int) ((Math.random() * (max - min + 1)) + min);
            if (team2.length - 1 == i) {
                System.out.print(team2[i]);
                System.out.println();
            } else {
                System.out.print(team2[i] + ", ");
            }
        }







    }
}
