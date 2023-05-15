package ua.hillel.brizhak.homeworks.Homework13;

public class BurgerMain {
    public static void main(String[] args) {
        Burger classic = new Burger("булочка", "м'ясо", "сир", "зелень", "майонез", false);
//        Burger classic1 = new Burger("булочка", "м'ясо", "сир", "зелень", "майонез");
        Burger classicWithoutSauce = new Burger("булочка", "м'ясо", "сир", "зелень");
        Burger doubleMeat = new Burger("булочка", "м'ясо", "сир", "зелень", "майонез", true);
    }
}
