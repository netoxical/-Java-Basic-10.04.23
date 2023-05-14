package ua.hillel.brizhak.lessons.lessons11;

public class AirCraftFactory {

    public static void main(String[] args) {

        Airplane jetF52 = new Airplane("Jet", "F52");
        Airplane boeing747SecondClass = new Airplane("boeing", "747", 300);
        Airplane boeing747FirstClass = new Airplane("boeing", "747", 300, 25);
    }
}
