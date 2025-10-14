package cz.gyarab.prg.e1.s1;

import java.util.Scanner;

public class Volby {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Hlasu pro stanu A:");
        int hlasuA =  sc.nextInt();

        System.out.println("Hlasu pro stanu B:");
        int hlasuB =  sc.nextInt();

        System.out.println("Hlasu pro stanu C:");
        int hlasuC =  sc.nextInt();

        System.out.println("Hlasu pro stanu D:");
        int hlasuD =  sc.nextInt();

        if (hlasuA >= hlasuB && hlasuA >= hlasuC && hlasuA >= hlasuD) {
            System.out.println("Vyhrala A.");
        } else if (hlasuB >= hlasuC && hlasuB >= hlasuD) {
            System.out.println("Vyhrala B.");
        } else if (hlasuC >= hlasuD) {
            System.out.println("Vyhrala C.");
        } else {
            System.out.println("Vyhrala D.");
        }

        int celkemHlasu = hlasuA + hlasuB + hlasuC + hlasuD;
        int volebniCislo = (celkemHlasu + 19) / 20;

        System.out.println("Celkem hlasu: " + celkemHlasu);
        System.out.println("Volebni cislo: " + volebniCislo);

        int pocetKreselA =  hlasuA / volebniCislo;
        int pocetKreselB =  hlasuB / volebniCislo;
        int pocetKreselC =  hlasuC / volebniCislo;
        int pocetKreselD =  hlasuD / volebniCislo;

        System.out.println("A: " + pocetKreselA);
        System.out.println("B: " + pocetKreselB);
        System.out.println("C: " + pocetKreselC);
        System.out.println("D: " + pocetKreselD);

        int celkemKresel = pocetKreselA + pocetKreselB + pocetKreselC + pocetKreselD;

        System.out.println("Celkem rozdeleno mandatu: " +  celkemKresel);
    }
}
