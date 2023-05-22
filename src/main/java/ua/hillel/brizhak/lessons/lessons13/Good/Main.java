package ua.hillel.brizhak.lessons.lessons13.Good;

import ua.hillel.brizhak.lessons.lessons13.Good.Obstacle.Obstacle;
import ua.hillel.brizhak.lessons.lessons13.Good.Obstacle.ObstacleImplPool;
import ua.hillel.brizhak.lessons.lessons13.Good.participant.Participant;
import ua.hillel.brizhak.lessons.lessons13.Good.participant.ParticipantImplCat;
import ua.hillel.brizhak.lessons.lessons13.Good.participant.ParticipantImplDog;

public class Main {
    public static void main(String[] args) {

//        ObstaclePool obstaclePool = new ObstaclePool();
//        ObstacleWall obstacleWall = new ObstacleWall();
//
//        ParticipantCat participantCat = new ParticipantCat("Tom");
//        ParticipantDog participantDog = new ParticipantDog("Bobik");
////        ParticipantRabbit participantRabbit = new ParticipantRabbit("Buny");
//
//
//        obstaclePool.start(participantCat);
//        obstaclePool.start(participantDog);
////        obstaclePool.start(participantRabbit);
//
//        obstacleWall.start(participantCat);
//        obstacleWall.start(participantDog);
////        obstacleWall.start(participantRabbit);


        Obstacle[] obstacles = {
                new ObstacleImplPool(),
                new ObstacleImplPool()
        };

        Participant[] participants = {
                new ParticipantImplCat("Tom"),
                new ParticipantImplDog("Buny")
        };


        for (Obstacle obstacle : obstacles) {
            for (Participant participant : participants) {
                obstacle.start(participant);
            }
        }







//        Participant participantCat = new ParticipantCat("Tom");
//        System.out.println(participantCat.getClass());
//
//        demo(participantCat);
    }
}
