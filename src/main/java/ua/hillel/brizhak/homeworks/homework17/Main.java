package ua.hillel.brizhak.homeworks.homework17;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        runApp();
    }


    static void runApp() {
        Drinks[] drinks = Drinks.values();
        Scanner scanner = new Scanner(System.in);
        int price = 0;
        int start = 0;
        Drinks userDrink = null;
        while (start <= 1) {
            while (userDrink == null) {
                System.out.println("enter the drink you want " + Arrays.toString(drinks));
                String userValue = scanner.nextLine().toUpperCase();
                for (Drinks drink : drinks) {
                    if (userValue.equals(drink.toString())) {
                        userDrink = Drinks.valueOf(userValue);
                        break;
                    }
                }
            }
            switch (userDrink) {
                case COFFEE: {
                    System.out.println(Drinks.COFFEE.getType() + " is being prepared");
                    price = price + Drinks.COFFEE.getPrice();
                    new Counter();
                    userDrink = null;
                    start = 0;
                    break;
                }
                case TEA: {
                    System.out.println(Drinks.TEA.getType() + " is being prepared");
                    price = price + Drinks.TEA.getPrice();
                    new Counter();
                    userDrink = null;
                    start = 0;
                    break;
                }
                case LEMONADE: {
                    System.out.println(Drinks.LEMONADE.getType() + " is being prepared");
                    price = price + Drinks.LEMONADE.getPrice();
                    new Counter();
                    userDrink = null;
                    start = 0;
                    break;
                }
                case MOJITO: {
                    System.out.println(Drinks.MOJITO.getType() + " is being prepared");
                    price = price + Drinks.MOJITO.getPrice();
                    new Counter();
                    userDrink = null;
                    start = 0;
                    break;
                }
                case MINERAL: {
                    System.out.println(Drinks.MINERAL.getType() + " is being prepared");
                    price = price + Drinks.MINERAL.getPrice();
                    new Counter();
                    userDrink = null;
                    start = 0;
                    break;
                }
                case COCACOLA: {
                    System.out.println(Drinks.COCACOLA.getType() + " is being prepared");
                    price = price + Drinks.COCACOLA.getPrice();
                    new Counter();
                    userDrink = null;
                    start = 0;
                    break;
                }
                case EXIT: {
                    start++;
                    break;
                }
            }
        }

        int counter = Counter.getCounter();
        if (counter == 1) {
            System.out.println("You order " + counter + " drink. Payable " + price + " UAH");
        } else {
            System.out.println("You order " + counter + " drinks. Payable " + price + " UAH");
        }
    }
}

