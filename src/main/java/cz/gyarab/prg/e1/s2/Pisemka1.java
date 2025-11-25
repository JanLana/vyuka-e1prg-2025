package cz.gyarab.prg.e1.s2;

public class Pisemka1 {
    public static void main(String[] args) {
        /*
        for (int i = 0; i < 1000; i++) {
            if (i%3 == 0) {
                continue;
            }
            if (i%13 == 0) {
                continue;
            }
            System.out.println(i);

        }

        int i = 0;
        while(i < 1000){
            if (i%3 != 0 && i%13 != 0) {
                System.out.println();
            }
            i = i + 1;
        }

         */

        int[] arr = { 9, 4,3,12,67,2,7 };

        for (int k = 0; k < arr.length; k++) {
            int nejvetsi = arr[0];
            int poziceNejvetsiho = 0;

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > nejvetsi) {
                    nejvetsi = arr[i];
                    poziceNejvetsiho = i;
                }
            }

            System.out.println("v policku " + poziceNejvetsiho + " je nejvetsi hodnota " + nejvetsi);
            arr[poziceNejvetsiho] = 0;
        }
    }
}
