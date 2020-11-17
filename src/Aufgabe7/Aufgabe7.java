package Aufgabe7;

public class Aufgabe7 {
    public static void main(String[] args) {
        Hund A = new Hund("Bert",5,10);
        Hund B = new Hund("Joesefine",2,3);

        System.out.println(A.getName());
        System.out.println(A.getAlter());
        System.out.println(A.getGewicht());


        System.out.println(B.getName());
        System.out.println(B.getGewicht());
        System.out.println(B.getAlter());

        B.setGewicht(2);
        B.setName("Josefine");

        System.out.println(B.getName());
        System.out.println(B.getGewicht());

    }


}
