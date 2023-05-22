package ua.hillel.brizhak.homeworks.Homework15;

import ua.hillel.brizhak.homeworks.Homework15.MusicStyles.MusicStyles;
import ua.hillel.brizhak.homeworks.Homework15.MusicStyles.MusicStylesClassic;
import ua.hillel.brizhak.homeworks.Homework15.MusicStyles.MusicStylesPop;
import ua.hillel.brizhak.homeworks.Homework15.MusicStyles.MusicStylesRock;
import ua.hillel.brizhak.homeworks.Homework15.MusicalGroup.MusicalGroup;

public class Main {
    public static void main(String[] args) {
        MusicalGroup[] pop = new MusicalGroup[3];
        pop[0] = new MusicalGroup("The Beatles");
        pop[1] = new MusicalGroup("Maroon 5");
        pop[2] = new MusicalGroup("ABBA");

        MusicalGroup[] rock = new MusicalGroup[3];
        rock[0] = new MusicalGroup("The Rolling Stones");
        rock[1] = new MusicalGroup("Pink Floyd");
        rock[2] = new MusicalGroup("AC/DC");

        MusicalGroup[] classic = new MusicalGroup[3];
        classic[0] = new MusicalGroup("Johann Sebastian Bach");
        classic[1] = new MusicalGroup("Wolfgang Amadeus Mozart");
        classic[2] = new MusicalGroup("Ludwig van Beethoven");

        MusicStyles[] popStyle = {
                new MusicStylesPop()
        };
        MusicStyles[] rockStyle = {
                new MusicStylesRock()
        };
        MusicStyles[] classicStyle = {
                new MusicStylesClassic()
        };


        for (MusicStyles musicStyles : popStyle) {
            for (MusicalGroup musicalGroup : pop) {
                musicStyles.playMusic(musicalGroup);
            }
        }
        for (MusicStyles musicStyles : rockStyle) {
            for (MusicalGroup musicalGroup : rock) {
                musicStyles.playMusic(musicalGroup);
            }
        }
        for (MusicStyles musicStyles : classicStyle) {
            for (MusicalGroup musicalGroup : classic) {
                musicStyles.playMusic(musicalGroup);
            }
        }









    }
}
