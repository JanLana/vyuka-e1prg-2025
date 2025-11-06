package cz.gyarab.prg.e1.s1;

import java.util.Random;

public class Pole13 {
    public static void main(String[] args) {
        Random r = new Random();

        int[] arr;
        arr = new int[3];

        for(int i = 0; i < 3; i++) {
            arr[i] = r.nextInt(1001);
        }

        for(int i = 0; i < 3; i++) {
            System.out.println("arr[" + i + "] = " + arr[i]);
        }

    }
}
