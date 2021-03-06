package Aufgabe3;

import org.w3c.dom.ls.LSOutput;

public class Zimmer {

    private boolean clean;
    private int space;
    private int numberOfWindows;
    private int cost;


    //default Konstruktor
    public Zimmer(){
        clean = true;
        space = 10;
        numberOfWindows = 1;
        cost = 300;
    }

    //Konstruktor
    public Zimmer(int space,int numberOfWindows, int cost, boolean clean){
        this.space = space;
        this.numberOfWindows = numberOfWindows;
        this.cost = cost;
        this.clean = clean;
    }


    public void ausgabe (){
        System.out.println("Es ist sauber: "+ clean);
        System.out.println("Es ist "+ space +" Quadratmeter groß");
        System.out.println("Es hat " +numberOfWindows+" Fenster");
        System.out.println("Es kostet "+ cost+" euro im Monat");
        System.out.println();
    }
}
