package Aufgabe8_9;

public class Aufgabe8_9 {
    public static void main(String[] args) {

        Person Ghandi = new Person(170,40);


        System.out.println(Ghandi.BMI);
        Ghandi.ausgabe();

        Ghandi.setGroesse(120);
        Ghandi.setGewicht(85);


        Ghandi.ausgabe();

        Ghandi.setGroesse(200);
        Ghandi.setGroesse(100);

        System.out.println(Ghandi.BMI);
        Ghandi.ausgabe();

        Ghandi.calcBMI();
    }
}
