package ua.hillel.brizhak.homeworks.Homework13;

public class Burger {

    String bun;
    String meat;
    String cheese;
    String greens;
    String sauce;
//    boolean bun;
//    boolean meat;
//    boolean cheese;
//    boolean greens;
//    boolean sauce;
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
        System.out.println("Classic burger: "
                + this.bun + " подвійне "
                + this.meat + " " + this.cheese
                + " " + this.greens + " "
                + this.sauce);
    }


//    public Burger(boolean bun, boolean meat, boolean cheese, boolean greens, boolean sauce) {
//        this.bun = bun;
//        this.meat = meat;
//        this.cheese = cheese;
//        this.greens = greens;
//        this.sauce = sauce;
//        System.out.println("Classic burger: булочка, м'ясо, сир, зелень, майонез");
//    }
//
//    public Burger(boolean bun, boolean meat, boolean cheese, boolean greens) {
//        this.bun = bun;
//        this.meat = meat;
//        this.cheese = cheese;
//        this.greens = greens;
//        System.out.println("Classic burger: булочка, м'ясо, сир, зелень");
//    }
//
//    public Burger(boolean bun, boolean meat, boolean cheese, boolean greens, boolean sauce, boolean doubleMeat) {
//        this.bun = bun;
//        this.meat = meat;
//        this.cheese = cheese;
//        this.greens = greens;
//        this.sauce = sauce;
//        this.doubleMeat = doubleMeat;
//        System.out.println("Classic burger: булочка, подвійне м'ясо, сир, зелень, майонез");
//    }
}
