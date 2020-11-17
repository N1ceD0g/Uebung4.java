package Aufgabe7;

public class Hund {

    private String name;
    private int alter;
    private double gewicht;


    public Hund (){                                                                                                     //default Konstruktor
        name = "Frisbee";
        alter = 12;
        gewicht = 20;
    }

    public Hund (String name,int alter, int gewicht){                                                                   //"normaler" Konstruktor mit allen Attributen
        this.name = name;
        this.alter = alter;
        this.gewicht = gewicht;
    }


    public String getName(){                                                                                            //setter;getter Methoden
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public int getAlter(){
        return alter;
    }
    public void setAlter(int alter){
        this.alter = alter;
    }

    public double getGewicht(){
        return gewicht;
    }
    public void setGewicht(int gewicht){
        this.gewicht=gewicht;
    }
}
