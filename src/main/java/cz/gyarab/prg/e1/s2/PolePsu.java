package cz.gyarab.prg.e1.s2;

import java.util.Arrays;

public class PolePsu {
    public static void main(String[] args) {
        Pes[] arr;

        arr = new Pes[4];
        /*
        arr[0] = new Pes();
        arr[0].jmeno = "Alik";
        arr[0].rasa = "vorech";
         */
        arr[0] = new Pes("Dasenka", "vorech");
        arr[1] = new Pes("AAAA", "ovcak");
        arr[2] = new Pes("Alik", "vorech");
        arr[3] = new Pes("BBB", "austrlak");

        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].druh + " " + arr[i].jmeno);
        }

    }
}
