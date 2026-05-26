package cz.gyarab.prg.e1.s2;

import java.util.Arrays;

public class Median {
    public static void main(String[] args) {
        String[] arr = {
                "Adéla",
                "Ema",
                "Violeta",
                "Nazarii",
                "Lucie",
                "Tomáš",
                "Ondřej",
                "David",
                "Adam",
                "Robin",
                "Oleksandr",
                "Jakub",
                "Daniel",
                "Vojtěch",
                "Erik"
        };

        System.out.println(arr[arr.length/2]);
        Arrays.sort(arr);
        System.out.println(arr[arr.length/2]);

    }
}
