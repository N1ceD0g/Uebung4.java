package Aufgabe8_9;

public class Person {
    int groesse;        // in cm
    int gewicht;        // in kg
    int BMI;

    public Person(){
        groesse = 1;
        gewicht = 1;
        BMI = (gewicht/ (groesse * groesse));
    }

    public Person (int groesse, int gewicht ){
        this.groesse = groesse;
        this.gewicht = gewicht;
        BMI = (gewicht/(groesse * groesse));
    }




    public void setGroesse(int groesse){
        this.groesse = groesse;
    }
    public int getGroesse(){
        return groesse;
    }

    public void setGewicht(int gewicht){
        this.gewicht = gewicht;
    }
    public int getGewicht(){
        return gewicht;
    }

    public void ausgabe(){
        System.out.println("Größe: " + getGroesse());
        System.out.println("Gewicht: " + getGewicht());
        System.out.println("BMI:" +  BMI);
    }
}
