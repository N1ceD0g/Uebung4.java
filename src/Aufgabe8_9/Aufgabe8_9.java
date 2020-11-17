package Aufgabe8_9;

public class Aufgabe8_9 {
    public static void main(String[] args) {

        Person Ghandi = new Person(170,40);


        System.out.println(Ghandi.getBMI());

        Ghandi.setGroesse(178);
        Ghandi.setGewicht(85);

        System.out.println(Ghandi.BMI);

        Ghandi.ausgabe();
    }
}
