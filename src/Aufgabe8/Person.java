package Aufgabe8;

public class Person {
    int groesse;
    int gewicht;
    int BMI;

    public Person(){
        groesse = 1;
        gewicht = 1;
        BMI = (gewicht/groesse * groesse);
    }

    public Person (int groesse, int gewicht){
        this.gewicht = gewicht;
        this.groesse = groesse;
        BMI = (gewicht/groesse * groesse);
        

    }
}
