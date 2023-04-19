package ua.hillel.brizhak.homeworks.homework6;

import java.util.Scanner;

public class Homework6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String firstTeam = sc.nextLine();
        System.out.println("firstTeam = " + firstTeam);

        int firstTeam1Player = 0;
        if(sc.hasNextInt()) {
            firstTeam1Player = sc.nextInt();
        } else {
            System.out.println("Wrong dta! Try again");
            System.exit(0);
        }
        int firstTeam2Player = 0;
        if(sc.hasNextInt()) {
            firstTeam2Player = sc.nextInt();
        } else {
            System.out.println("Wrong dta! Try again");
            System.exit(0);
        }
        int firstTeam3Player = 0;
        if(sc.hasNextInt()) {
            firstTeam3Player = sc.nextInt();
        } else {
            System.out.println("Wrong dta! Try again");
            System.exit(0);
        }
        int firstTeam4Player = 0;
        if(sc.hasNextInt()) {
            firstTeam4Player = sc.nextInt();
        } else {
            System.out.println("Wrong dta! Try again");
            System.exit(0);
        }
        int firstTeam5Player = 0;
        if(sc.hasNextInt()) {
            firstTeam5Player = sc.nextInt();
        } else {
            System.out.println("Wrong dta! Try again");
            System.exit(0);
        }
        System.out.println("firstTeam1Player = " + firstTeam1Player);
        System.out.println("firstTeam2Player = " + firstTeam2Player);
        System.out.println("firstTeam3Player = " + firstTeam3Player);
        System.out.println("firstTeam4Player = " + firstTeam4Player);
        System.out.println("firstTeam5Player = " + firstTeam5Player);
        sc.nextLine();


        String secondTeam = sc.nextLine();
        System.out.println("secondTeam = " + secondTeam);

        int secondTeam1Player = 0;
        if(sc.hasNextInt()) {
            secondTeam1Player = sc.nextInt();
        } else {
            System.out.println("Wrong dta! Try again");
            System.exit(0);
        }
        int secondTeam2Player = 0;
        if(sc.hasNextInt()) {
            secondTeam2Player = sc.nextInt();
        } else {
            System.out.println("Wrong dta! Try again");
            System.exit(0);
        }
        int secondTeam3Player = 0;
        if(sc.hasNextInt()) {
            secondTeam3Player = sc.nextInt();
        } else {
            System.out.println("Wrong dta! Try again");
            System.exit(0);
        }
        int secondTeam4Player = 0;
        if(sc.hasNextInt()) {
            secondTeam4Player = sc.nextInt();
        } else {
            System.out.println("Wrong dta! Try again");
            System.exit(0);
        }
        int secondTeam5Player = 0;
        if(sc.hasNextInt()) {
            secondTeam5Player = sc.nextInt();
        } else {
            System.out.println("Wrong dta! Try again");
            System.exit(0);
        }
        System.out.println("secondTeam1Player = " + secondTeam1Player);
        System.out.println("secondTeam2Player = " + secondTeam2Player);
        System.out.println("secondTeam3Player = " + secondTeam3Player);
        System.out.println("secondTeam4Player = " + secondTeam4Player);
        System.out.println("secondTeam5Player = " + secondTeam5Player);
        sc.nextLine();

        double averageFirstTeamKills = (double)(firstTeam1Player + firstTeam2Player + firstTeam3Player + firstTeam4Player + firstTeam5Player) / 5;
        System.out.println("averageFirstTeamKills = " + averageFirstTeamKills);
        double averageSecondTeamKills = (double)(secondTeam1Player + secondTeam2Player + secondTeam3Player + secondTeam4Player + secondTeam5Player) / 5;
        System.out.println("averageSecondTeamKills = " + averageSecondTeamKills);

        if(averageFirstTeamKills > averageSecondTeamKills) {
            System.out.println("Winner = " + firstTeam);
        } else if(averageFirstTeamKills < averageSecondTeamKills) {
            System.out.println("Winner = " + secondTeam);
        } else {
            System.out.println("Tie");
        }
    }
}
