package Aufgabe3;

public class Aufgabe3 {
    public static void main(String[] args) {
        Zimmer mine = new Zimmer(10,1,200,false);

        mine.ausgabe();

        Zimmer notMine = new Zimmer(20,2,450,true);

        notMine.ausgabe();

    }
}
