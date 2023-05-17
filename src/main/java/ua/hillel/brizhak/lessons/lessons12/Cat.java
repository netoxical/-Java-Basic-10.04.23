package ua.hillel.brizhak.lessons.lessons12;

public class Cat extends Animal {
    void meow () {
        System.out.println(name + " meow");
    }

    @Override
    void eat() {
        meow();
        meow();
        System.out.println(name + " eating!!!!!");
    }
}
