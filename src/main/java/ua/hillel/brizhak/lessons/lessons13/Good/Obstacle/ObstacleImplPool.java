package ua.hillel.brizhak.lessons.lessons13.Good.Obstacle;

import ua.hillel.brizhak.lessons.lessons13.Good.participant.Participant;

public class ObstacleImplPool extends Obstacle {
    @Override
    public void start(Participant participant) {
        System.out.println(participant.getName() + " start swim");
    }
}
