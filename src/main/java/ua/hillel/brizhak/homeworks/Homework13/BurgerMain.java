package ua.hillel.brizhak.homeworks.Homework13;

public class BurgerMain {
    public static void main(String[] args) {
        Burger classic = new Burger("�������", "�'���", "���", "������", "�������", false);
//        Burger classic1 = new Burger("�������", "�'���", "���", "������", "�������");
        Burger classicWithoutSauce = new Burger("�������", "�'���", "���", "������");
        Burger doubleMeat = new Burger("�������", "�'���", "���", "������", "�������", true);
    }
}
