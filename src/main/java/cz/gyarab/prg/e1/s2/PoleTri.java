package cz.gyarab.prg.e1.s2;


import java.util.Random;

public class PoleTri {



    public static void main(String[] args) {
        Random r = new Random();

        int[] arr;
        arr = new int[13];

        for (int i = 0; i < 13; i++) {
            arr[i] = r.nextInt(1001);
        }

        for (int i = 0; i < 13; i++) {
            System.out.println(arr[i]);
        }
    }
}
