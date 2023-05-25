package ua.hillel.brizhak.lessons.lessons14;

public class Bird implements FlyibleAndRunnableChild {

    @Override
    public void fly() {
        System.out.println("Bird Fly");
    }

    @Override
    public void run() {
        System.out.println("Bird run");
    }
}
