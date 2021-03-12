package tes.edu.modul1;

/**
 * @author Arsenii
 * @version 1.0.0
 * @project vsem
 * @class AboutMe
 * @since 12.03.2021 - 00.55
 **/

public class AboutMe {
    public static void main(String[] args) {
        System.out.println("Hello..");
        byte myAge = 21;
        System.out.println("my age is " + myAge + " years.");

        double myHeight = 178.5;
        System.out.println("My height " + myHeight + "-cms.");

        float myWeight = 75.35f;
        System.out.println("My weight " + myWeight + "-kg.");

        char symbol = 'S';
        System.out.println("Super Hero have symbol - <<" + symbol + ">>.");

        short sleepTime = 3;
        System.out.println("I sleep " + sleepTime + "-hours a day.");

        long population = 1_017_699L;
        System.out.println("I live in a city with a population of "+ population + ".");

        int musicTime = 24;
        System.out.println("Better to listen to music every " + musicTime + " hours in a row.");

        boolean isFirstTask = true;
        System.out.println("This is the first example in practice - " + isFirstTask + ".");
    }
}
