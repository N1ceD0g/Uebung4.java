package Aufgabe5;

public class KomplexeZahl {
    int re;
    int im;


    //StandardKonstruktor:
    public KomplexeZahl() {
        re = 1;
        im = 2;
    }


    //Konstruktor KomplexeZahl:
    public KomplexeZahl(int realteil, int imaginaerteil) {
        re = realteil;
        im = imaginaerteil;
    }


    //Konstruktor natürliche Zahl:
    public KomplexeZahl(int realteil) {
        re = realteil;
        im = 0;
    }


    //Methode für die Ausgabe:
    public void ausgabe() {
        System.out.println(this.re + "+" + this.im + "i");
    }

}
