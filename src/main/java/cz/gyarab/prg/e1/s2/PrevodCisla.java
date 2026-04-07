package cz.gyarab.prg.e1.s2;

import java.util.Scanner;

public class PrevodCisla {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String vstup;

        int sum = 0;

        while(true) {
            int v;

            vstup = sc.next();
            try {
                v = prevodnik(vstup);
            } catch (NumberFormatException e) {
                v = 0;
            }
            sum = sum + v;
            System.out.println("soucet: " + sum);
        }
            int v = prevodnik(vstup);
            System.out.println(v+1);

        } catch() {
            System.out.println("spatny vstup");
        }

 */
    }

    public static int prevodnik(String vstup) {
        char[] arr = vstup.toCharArray();
        int vysledek = 100 * prevedNaCislo(arr[0]) + 10 * prevedNaCislo(arr[1]) + prevedNaCislo(arr[2]);
        return vysledek;
    }

    public static int prevedNaCislo(char vstup) {
        int vystup;

        switch(vstup) {
            case '1': vystup = 1; break;
            case '2': vystup = 2; break;
            case '3': vystup = 3; break;
            case '4': vystup = 4; break;
            case '5': vystup = 5; break;
            case '6': vystup = 6; break;
            case '7': vystup = 7; break;
            case '8': vystup = 8; break;
            case '9': vystup = 9; break;
            case '0': vystup = 0; break;
            default: throw new NumberFormatException("znak " + vstup + " neni cislo");
        }

        System.out.println("ahoj");

        return vystup;
    }
}
