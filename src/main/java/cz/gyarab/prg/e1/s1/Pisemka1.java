package cz.gyarab.prg.e1.s1;

import java.util.Arrays;

public class Pisemka1 {
    public static void main(String[] args) {
        /*
        for (int i = 1; i <= +1000; i+=2) {
            if (i % 7 != 0) {
                System.out.println(i);
            }
        }


        int i = 1;
        while (i <= 1000) {
            if (i % 7 != 0 && i % 2 != 0) {
                System.out.println(i);
            }
            i++;
        }
        */

        int arr[] = { 2,5,7,1,13,7,5,9, 99, 52};
        //Arrays.sort(arr);
        //Arrays.toString(arr);

        for (int j = 0; j < arr.length; j++) {
            int nejmensi = arr[0];
            int poziceNejmensiho = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] < nejmensi) {
                    nejmensi = arr[i];
                    poziceNejmensiho = i;
                }
            }
            System.out.println(nejmensi);

            //System.out.println("nejmensi je " + nejmensi + " a je na pozici " + poziceNejmensiho);
            arr[poziceNejmensiho] = 999999;
        }
    }
}
