package cz.gyarab.prg.e1.s1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Kalulacka {

    public static int cisloZPismenka(char ch) {
        if (ch == '0')  return 0;
        if (ch == '1') return 1;
        if (ch == '2') return 2;
        if (ch == '3') return 3;
        if (ch == '4') return 4;
        if (ch == '5') return 5;
        if (ch == '6') return 6;
        if (ch == '7') return 7;
        if (ch == '8') return 8;
        if (ch == '9') return 9;

        throw new InputMismatchException();
    }

    public static int dejCislo(Scanner sc) {
        String s = sc.next();
        char[] arr = s.toCharArray();

        int a = cisloZPismenka(arr[0]);
        int b = cisloZPismenka(arr[1]);
        int c = cisloZPismenka(arr[2]);

        return a * 100 + b * 10 + c;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;

        while(true) {
            try {
                i = dejCislo(sc);
                System.out.println("i=" + i);
                return;
            } catch (InputMismatchException e) {
                System.out.println("Spathe!!!");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("umim jen trojcifrna cisla");
            }
        }

    }
}


        /*
        double b;

        try {
            double a = sc.nextDouble();

            b = sc.nextDouble();
            double c = a / b;
            System.out.println(a + " / " + b + " = " + c);

        } catch(InputMismatchException nfe){
            System.out.println("Chyba - druhe cislo neni cislo");
        }
        */


