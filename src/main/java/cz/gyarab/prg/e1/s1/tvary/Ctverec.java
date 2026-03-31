package cz.gyarab.prg.e1.s1.tvary;

public class Ctverec extends Tvar implements UmiSeVypsat {
    double p;

    public Ctverec(double hranaA) {
        p = hranaA * hranaA;
    }

    public double plocha() {
        System.out.println("ctverec :-)");
        return p;
    }

    public void vypisSe() {
        System.out.println("jsem ctverec velikost " + plocha());
    }

    @Override
    public int vratPet() {
        return 0;
    }
}
