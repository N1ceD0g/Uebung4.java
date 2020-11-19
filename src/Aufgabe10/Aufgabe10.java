package Aufgabe10;

public class Aufgabe10 {
    public static void main(String[] args) {
        Winkel alpha = new Winkel(90);
        Winkel beta = new Winkel(180);

        System.out.println(alpha.getWinkelRad());
        System.out.println(alpha.getWinkelGrad());

        System.out.println(beta.getWinkelRad());
        System.out.println(beta.getWinkelGrad());

        System.out.println("addition: "+ alpha.addieren(beta).getWinkelGrad());




    }


}
