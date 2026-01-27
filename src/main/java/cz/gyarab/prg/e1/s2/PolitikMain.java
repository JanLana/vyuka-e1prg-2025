package cz.gyarab.prg.e1.s2;

public class PolitikMain {
    public static void main(String[] args) {
        Politik a = new Politik("Andrej", "Babis", 71, "predseda vlady");
        Politik b = new Politik("Karel","Havlíček", 56,"ministr průmyslu a obchodu");

        a.vypisSe();
        b.vypisSe();


        /*
        Politik c = new Politik();
        c.jmeno = ...;
        c.prijmeni= ....;
        c.vek = ...;
        c.poziceVeVlade = ...

         */

    }
}
