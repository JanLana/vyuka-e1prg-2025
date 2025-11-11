package cz.gyarab.prg.e1.s2;

public class Prvocisla {
    public static void main(String[] args) {
        int x = 65537;
        int jePrvocislo = 1;

        for (int i = 2; i < x; i++) {
            if (x % i == 0)  {
                jePrvocislo = -1;
            }
        }

        if (jePrvocislo == 1) {
            System.out.println("Cislo " + x + " je prvocislo");
        } else {
            System.out.println("Cislo " + x + " neni prvocislo");
        }
    }
}
