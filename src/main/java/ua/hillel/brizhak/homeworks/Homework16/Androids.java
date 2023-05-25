package ua.hillel.brizhak.homeworks.Homework16;

public class Androids implements Smartphones, LinuxOS {

    private String model;

    public Androids(String model) {
        this.model = model;
    }

    @Override
    public void call() {
        System.out.println("Пропущенный звонок");
    }

    @Override
    public void sms() {
        System.out.println("Пришло сообщение");
    }

    @Override
    public void internet() {
        System.out.println("Новые уведомления");
    }

    @Override
    public void telegram() {
        System.out.println("Новое сообщение");
    }
}
