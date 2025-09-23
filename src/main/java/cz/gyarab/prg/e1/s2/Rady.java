package cz.gyarab.prg.e1.s2;

public class Rady {
    public static void main(String[] args) {
        int i;
        i = 1;

        long soucet = 1;

        for (  ; i <= 21; i++) {  // i++ je to same jako i = i + 1;
            soucet = soucet * i;

            System.out.print(i);
            System.out.print(":");
            System.out.println(soucet);

            // System.out.println(i);
        }

        System.out.println(soucet);

    }

}
