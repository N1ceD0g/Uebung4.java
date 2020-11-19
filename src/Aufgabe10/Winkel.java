package Aufgabe10;

public class Winkel {
    public double winkel; // GRAD

    Winkel(double wert) {
        this.winkel = wert;
    }

    public void setWinkelGrad(double grad) {
        this.winkel = grad;
    }

    public void setWinkelRad(double rad) {
        this.winkel = Math.toDegrees(rad);
    }

    public double getWinkelGrad() {
        return winkel;
    }

    public double getWinkelRad() {
        return Math.toRadians(winkel);
    }

    public Winkel addieren(Winkel other) {
        double ergebnis = winkel + other.winkel;

        while (ergebnis > 360) {
            ergebnis = 0 + (ergebnis - 360);
        }

        return new Winkel(ergebnis);
    }
}








