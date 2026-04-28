package cz.gyarab.prg.e1.s2.tvary;

public class Ctverec extends Tvar implements UmiSeVypsat {
    double hranaA;

    public Ctverec(double hranaA) {
        this.hranaA = hranaA;
    }

    public double obvod() {
        return 4 * hranaA;
    }

    public void vypisSe() {
        System.out.println("Jsem ctverec " + hranaA + " x " + hranaA);
    }

    @Override
    public String vypisJakoString() {
        return "";
    }
}
