package ua.hillel.brizhak.homeworks.Homework15.MusicStyles;

import ua.hillel.brizhak.homeworks.Homework15.MusicalGroup.MusicalGroup;

public class MusicStylesClassic extends MusicStyles {
    @Override
    public void playMusic(MusicalGroup group) {
        System.out.println(group.getName() + " plays classical music");
    }
}
