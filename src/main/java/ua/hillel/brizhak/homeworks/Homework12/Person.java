package ua.hillel.brizhak.homeworks.Homework12;

public class Person {
    public static void main(String[] args) {
        personInfo("Will",
                " Smith",
                "New York",
                2936729462846L);
        personInfo("Jackie",
                " Chan",
                "Shanghai",
                12312412412L);
        personInfo("Sherlock",
                " Holmes",
                "London",
                37742123513L);
    }
    static void personInfo(String name, String surname, String city, long phoneNumber) {
        System.out.println("Зателефонувати громадянинові " + name + surname + " з міста " + city + " можна за номером " + phoneNumber);
    }

}
