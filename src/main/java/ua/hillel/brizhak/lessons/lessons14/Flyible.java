package ua.hillel.brizhak.lessons.lessons14;

public interface Flyible {

    public static final int DISTANCE = 20;

    public abstract void fly();

    default void demoDefaultMethod() {
        System.out.println("Default method");
    }

}
