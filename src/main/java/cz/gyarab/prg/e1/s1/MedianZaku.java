package cz.gyarab.prg.e1.s1;

import java.util.Arrays;

public class MedianZaku {
    public static void main(String[] args) {
        String[] arr = {
                "David",
                "Denys",
                "Adam",
                "Antonín",
                "Ondřej",
                "Jonáš",
                "Oliver",
                "Kryštof",
                "Jaroslav",
                "Lukáš",
                "Jáchym",
                "Matěj",
                "Lána"
        };


        System.out.println(arr[arr.length / 2]);

        Arrays.sort(arr);


        System.out.println(arr[arr.length / 2]);
    }
}
