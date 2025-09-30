package cz.gyarab.prg.e1.s1;

public class Rady {
    public static void main(String[] args) {

        int i;


        long soucet;
        soucet = 1;

        for (i = 1 ; i <= 100; i = i + 1) { // i++ -> i = i + 1
            // tady sectu neco s necim .fdslflkdsajfdlka System.out.println(i);
            soucet = soucet * i;

            System.out.print(i);
            System.out.print(":");
            System.out.println(soucet);

        }

        System.out.println(soucet);
    }

}
