package cz.gyarab.prg.e1.s1;

import java.util.Arrays;

public class PoleLidi {
    public static void main(String[] args) {
        Clovek[] arr = new Clovek[4];
        arr[0] = new Clovek("Jan", "Hus", 37);
        arr[1] = new Clovek("Jan", "Adam", 50);
        arr[2] = new Clovek("Bozena", "Bila", 23);
        arr[3] = new Clovek("Anna", "Bila", 24);

        System.out.println("nesetridene:");
        for (int i = 0; i < arr.length; i++) {
            arr[i].vypisSeClovek();
        }

        Arrays.sort(arr);

        System.out.println("SETRIDENE:");
        for (int i = 0; i < arr.length; i++) {
            arr[i].vypisSeClovek();
        }

    }
}
