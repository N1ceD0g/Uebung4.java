package Aufgabe6;

public class Aufgabe6 {
    public static void main(String[] args) {

        Bruchzahl x = new Bruchzahl(4,2);
        Bruchzahl y = new Bruchzahl(5,4);
        Bruchzahl ergebnis_add;
        Bruchzahl ergebnis_mult;


        Bruchrechnen addition = new Bruchrechnen();
        Bruchrechnen multiplikation = new Bruchrechnen();

        ergebnis_add = addition.addieren(x,y);
        System.out.println(ergebnis_add.z + "/" + ergebnis_add.n);

        ergebnis_mult = multiplikation.multiplizieren(x,y);
        System.out.println(ergebnis_mult.z + "/" + ergebnis_mult.n);
    }
}
