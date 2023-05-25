package ua.hillel.brizhak.homeworks.Homework16;

public class IPhones implements Smartphones, IOS {
    private String model;

    public IPhones(String model) {
        this.model = model;
    }

    @Override
    public void call() {
        System.out.println("У вас пропущенный вызов");
    }

    @Override
    public void sms() {
        System.out.println("Вам пришло SMS");
    }

    @Override
    public void internet() {
        System.out.println("Непрочитанное уведомление");
    }

    @Override
    public void applePay() {
        System.out.println("Оплата прошла успешно");
    }
}
