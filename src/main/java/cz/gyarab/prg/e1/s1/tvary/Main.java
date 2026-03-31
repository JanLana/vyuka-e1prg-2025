package cz.gyarab.prg.e1.s1.tvary;

import cz.gyarab.prg.e1.s1.zverinec.Kocka;

public class Main {
    public void potrzeno(UmiSeVypsat u) {
        u.vypisSe();
        System.out.println("=================");

    }
    public static void main(String[] args) {
        Tvar[] arr = new Tvar[6];

        arr[0] = new Ctverec(10);
        arr[1] = new Ctverec(20);
        arr[2] = new Ctverec(30);
        arr[3] = new Obdelnik(10,5);
        arr[4] = new Obdelnik(20,7);
        arr[5] = new Obdelnik(30,10);

        UmiSeVypsat[] arr2 = new UmiSeVypsat[10];
        arr2[0] = new Ctverec(10);
        //arr2[1] = new Kocka();



        double soucet = 0;
        for (int i = 0; i < arr.length; i++) {
            soucet += arr[i].plocha();
        }

        System.out.println(soucet);
    }
}
