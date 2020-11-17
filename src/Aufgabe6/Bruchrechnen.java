package Aufgabe6;

public class Bruchrechnen {
    public Bruchrechnen(){}


    public Bruchzahl addieren (Bruchzahl a, Bruchzahl b){
        Bruchzahl c = new Bruchzahl();
        if (a.n != b.n){
            c.n = (a.n * b.n);
            c.z = (a.z *b.n * b.z *b.n);

        }else{
            c.n = a.n;
            c.z = (a.z + b.z);
        }

        return c;
    }

    public Bruchzahl multiplizieren (Bruchzahl a, Bruchzahl b){
        Bruchzahl c = new Bruchzahl();
        c.n = a.n * b.n;
        c.z = a.z * b.z;
        return c;
    }
}
