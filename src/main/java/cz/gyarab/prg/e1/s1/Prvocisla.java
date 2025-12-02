package cz.gyarab.prg.e1.s1;

public class Prvocisla {
    public static void main(String[] args) {
        int x = 17;
        int jePrvocislo = 1;

        for (int i = 2; i < x; i++) {
            System.out.println("i=" + i + " jePrvocislo=" + jePrvocislo);

            if (x % i == 0) {
                jePrvocislo = -1;
            }
        }

        if (jePrvocislo == 1) {
            System.out.println(x);
        }
    }
}
