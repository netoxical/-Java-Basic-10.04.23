package ua.hillel.brizhak.homeworks.Homework16;

public class IPhones implements Smartphones, IOS {
    private String model;

    public IPhones(String model) {
        this.model = model;
    }

    @Override
    public void call() {
        System.out.println("� ��� ����������� �����");
    }

    @Override
    public void sms() {
        System.out.println("��� ������ SMS");
    }

    @Override
    public void internet() {
        System.out.println("������������� �����������");
    }

    @Override
    public void applePay() {
        System.out.println("������ ������ �������");
    }
}
