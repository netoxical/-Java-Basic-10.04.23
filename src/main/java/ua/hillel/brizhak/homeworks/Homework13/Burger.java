package ua.hillel.brizhak.homeworks.Homework13;

public class Burger {

    String bun;
    String meat;
    String cheese;
    String greens;
    String sauce;
    boolean doubleMeat;

    public Burger(String bun, String meat, String cheese, String greens, String sauce) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.greens = greens;
        this.sauce = sauce;
        System.out.println("Classic burger: "
                + this.bun + " "
                + this.meat + " " + this.cheese
                + " " + this.greens + " "
                + this.sauce);
    }
    public Burger(String bun, String meat, String cheese, String greens) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.greens = greens;
        System.out.println("Classic burger: "
                + this.bun + " "
                + this.meat + " " + this.cheese
                + " " + this.greens);
    }
    public Burger(String bun, String meat, String cheese, String greens, String sauce, boolean doubleMeat) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.greens = greens;
        this.sauce = sauce;
        this.doubleMeat = doubleMeat;
        if (doubleMeat == true) {
            System.out.println("Classic burger: "
                    + this.bun + " подвійне "
                    + this.meat + " " + this.cheese
                    + " " + this.greens + " "
                    + this.sauce);
        } else if (doubleMeat == false) {
                System.out.println("Classic burger: "
                        + this.bun + " "
                        + this.meat + " " + this.cheese
                        + " " + this.greens + " "
                        + this.sauce);
        }
    }
    }

