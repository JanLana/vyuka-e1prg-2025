package cz.gyarab.prg.e1.s1.tvary;

public class Obdelnik extends Tvar {
    double hranaA;
    double hranaB;

    public Obdelnik(double hranaA, double hranaB) {
        this.hranaA = hranaA;
        this.hranaB = hranaB;
    }

    public double plocha() {
        System.out.println("jsem odelnik");
        return hranaA * hranaB;
    }

    public void vypisSe() {
        System.out.println("Ja jsem obdelnik velikosti " + plocha());
    }
}
