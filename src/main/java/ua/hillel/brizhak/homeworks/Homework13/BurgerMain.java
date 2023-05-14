package ua.hillel.brizhak.homeworks.Homework13;

public class BurgerMain {
    public static void main(String[] args) {
        Burger classic = new Burger("булочка", "мясо", "сир", "зелень", "майонез");
        Burger classicWithoutSauce = new Burger("булочка", "мясо", "сир", "зелень");
        Burger doubleMeat = new Burger("булочка", "мясо", "сир", "зелень", "майонез", true);


//        Burger classic = new Burger(true, true, true, true, true);
//        Burger classicWithoutSauce = new Burger(true, true, true, true);
//        Burger doubleMeat = new Burger(true, true, true, true, true, true);
    }
}
