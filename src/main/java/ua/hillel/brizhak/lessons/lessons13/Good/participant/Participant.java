package ua.hillel.brizhak.lessons.lessons13.Good.participant;

public abstract class Participant {
    private String name;

    public Participant(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
