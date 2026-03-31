package cz.gyarab.prg.e1.s2.tvary;

public class Obdelnik extends Tvar {
    double ob;

    public Obdelnik(double hranaA, double hranaB) {
        ob = hranaA + hranaB + hranaA + hranaB;
    }

    public double obvod() {
        return ob;
    }
}
