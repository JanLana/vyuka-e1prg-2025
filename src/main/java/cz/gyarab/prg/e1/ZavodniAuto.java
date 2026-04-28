package cz.gyarab.prg.e1;

import java.io.Serializable;
import java.util.Arrays;

public class ZavodniAuto implements Comparable<ZavodniAuto> {
    int zavodniCislo;
    String typAuta;
    String barvaAuta;

    public ZavodniAuto(int zavodniCislo, String typAuta, String barvaAuta) {
        this.zavodniCislo = zavodniCislo;
        this.typAuta = typAuta;
        this.barvaAuta = barvaAuta;
    }

    @Override
    public String toString() {
        return "ZavodniAuto{" +
                "zavodniCislo=" + zavodniCislo +
                ", typAuta='" + typAuta + '\'' +
                ", barvaAuta='" + barvaAuta + '\'' +
                '}';
    }

    public static void main(String[] args) {
        //ZavodniAuto[] auto = new ZavodniAuto[5];
        //auto[0] = new ZavodniAuto(1, "A", "B");
        //auto[1] = new ZavodniAuto(2, "C", "D");
        //...
        ZavodniAuto[] auto = {
                new ZavodniAuto(1, "BMW", "cerna"),
                new ZavodniAuto(20, "Skoda", "bila"),
                new ZavodniAuto(13, "BMW", "cervena"),
                new ZavodniAuto(4, "Skoda", "zelena"),
                new ZavodniAuto(5, "BMW", "zelena"),
        };

        for (int i = 0; i < auto.length; i++) {
            System.out.println(auto[i]);
        }

        Arrays.sort(auto);

        System.out.println("Zrovnane: ");
        for (int i = 0; i < auto.length; i++) {
            System.out.println(auto[i]);
        }

    }

    @Override
    public int compareTo(ZavodniAuto o) {
        /*
        if (zavodniCislo > o.zavodniCislo) {
            return 1;
        }  else if (zavodniCislo < o.zavodniCislo) {
            return -1;
        } else {
            return 0;
        }
         */
        if (typAuta.equals(o.typAuta)) {
            return 0;
        }  else if (typAuta.compareTo(o.typAuta) < 0) {
            return -1;
        } else {
            return 1;
        }
    }
}
