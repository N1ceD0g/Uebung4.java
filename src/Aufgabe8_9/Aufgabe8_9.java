package Aufgabe8_9;

public class Aufgabe8_9 {
    public static void main(String[] args) {

        Person Ghandi = new Person(170,4);


        System.out.println(Ghandi.BMI);

        Ghandi.setGroesse(180);
        Ghandi.setGewicht(75);

        System.out.println(Ghandi.BMI);

        Ghandi.ausgabe();
    }
}
