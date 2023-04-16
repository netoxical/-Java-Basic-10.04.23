package ua.hillel.brizhak.homeworks.homework5;

public class homework5 {
    public static void main(String[] args) {

        int warriorLi = 13;
        int archerLi = 24;
        int riderLi = 46;
        int armyLi = 860;
        int armyStrengthLi = warriorLi * armyLi + archerLi * armyLi + riderLi * armyLi;
        int warriorMin = 9;
        int archerMin = 35;
        int riderMin = 12;
//        double armyMin = armyLi * 1.5;
        int armyMin = (int) (armyLi * 1.5);
        int armyStrengthMin = warriorMin * armyMin + archerMin * armyMin + riderLi * armyMin;

        System.out.println(armyLi);
        System.out.println(armyMin);
        System.out.println("armyStrengthLi =" + armyStrengthLi);
        System.out.println("armyStrengthMin =" + armyStrengthMin);


    }
}
