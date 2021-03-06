package Aufgabe8_9;

public class Person {
    int groesse;        // in cm
    int gewicht;        // in kg
    int BMI;

    public void calcBMI() {
        this.BMI = (gewicht*10000/ (groesse * groesse));
    }

    public Person(){
        this.groesse = 1;
        this.gewicht = 1;
        calcBMI();
    }

    public Person (int groesse, int gewicht){
        this.groesse = groesse;
        this.gewicht = gewicht;
        calcBMI();
    }

    public void setGroesse(int groesse){
        this.groesse = groesse;
        calcBMI();
    }
    public int getGroesse(){
        return groesse;
    }

    public void setGewicht(int gewicht){
        this.gewicht = gewicht;
        calcBMI();
    }
    public int getGewicht(){
        return gewicht;
    }

    public int getBMI() {
        return this.BMI;
    }


    public void ausgabe(){
        System.out.println("Größe: " + getGroesse());
        System.out.println("Gewicht: " + getGewicht());
        System.out.println("BMI:" + getBMI());
        System.out.println();
    }
}
