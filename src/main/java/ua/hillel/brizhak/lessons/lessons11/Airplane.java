package ua.hillel.brizhak.lessons.lessons11;

public class Airplane {
    String type;
    String name;
    int firstClassPassengers;
    int secondClassPassengers;

    public Airplane(String type, String name) {
        this.type = type;
        this.name = name;
        System.out.println("Винущувачі: " + this.type + this.name);
    }

    public Airplane(String type, String name, int secondClassPassengers) {
        this.type = type;
        this.name = name;
        this.secondClassPassengers = secondClassPassengers;
        System.out.println("Пасажирський без бізнес класу: " + this.type + this.name + " " + this.secondClassPassengers);
    }

    public Airplane(String type, String name, int firstClassPassengers, int secondClassPassengers) {
        this.type = type;
        this.name = name;
        this.firstClassPassengers = firstClassPassengers;
        this.secondClassPassengers = secondClassPassengers;
        System.out.println("Пасажирський бізнес клас: " + this.type + this.name + " " + this.secondClassPassengers + " " + this.firstClassPassengers);
    }




}
