package cz.gyarab.prg.e1.s2.tvary;

import cz.gyarab.prg.e1.s2.zverinec.Kocka;

import java.io.OptionalDataException;

public class Main {
    public static void podtrzene(UmiSeVypsat m) {
        m.vypisSe();
        System.out.println("==============");
    }

    public static void main(String[] args) {
        UmiSeVypsat[] all = new UmiSeVypsat[3];
        all[0] = new Kocka("mica");
        all[1] = new Ctverec(4);


        Tvar[] arrC = new Ctverec[6];
        arrC[0] = new Ctverec(10);
        arrC[1] = new Ctverec(20);
        arrC[2] = new Ctverec(30);
        arrC[3] = new Obdelnik(10,1);
        arrC[4] = new Obdelnik(10,2);
        arrC[5] = new Obdelnik(10,3);

        double vysledek = 0;
        for (int i = 0; i < arrC.length; i++) {
            vysledek = vysledek + arrC[i].obvod();
        }
        System.out.println(vysledek);


    }
}
