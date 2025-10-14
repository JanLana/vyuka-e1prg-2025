package cz.gyarab.prg.e1.s2;

import javax.xml.transform.Source;
import java.util.Scanner;

public class Volby {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Pocet hlasu pro stranu A: ");
        int hlasuA = sc.nextInt();

        System.out.println("Pocet hlasu pro stranu B: ");
        int hlasuB = sc.nextInt();

        System.out.println("Pocet hlasu pro stranu C: ");
        int hlasuC = sc.nextInt();

        System.out.println("Pocet hlasu pro stranu D: ");
        int hlasuD = sc.nextInt();

        System.out.println("Strana A dostala " + hlasuA + " hlasu.");
        System.out.println("Strana B dostala " + hlasuB + " hlasu.");
        System.out.println("Strana C dostala " + hlasuC + " hlasu.");
        System.out.println("Strana D dostala " + hlasuD + " hlasu.");

        if (hlasuA >= hlasuB && hlasuA >= hlasuC && hlasuA >= hlasuD) {
            System.out.println("Vyhrala A");
        } else if (hlasuB >= hlasuC && hlasuB >= hlasuD) {
            System.out.println("Vyhrala B");
        } else if (hlasuC >= hlasuD) {
            System.out.println("Vyhrala C");
        } else {
            System.out.println("Vyhrala D");
        }

        int celkemHlasu = hlasuA + hlasuB + hlasuC + hlasuD;
        int volebniCislo = celkemHlasu / 20;
        if (volebniCislo * 20 < celkemHlasu) {
            volebniCislo = volebniCislo + 1;
        }

        System.out.println("Celkem hlasu: " + celkemHlasu);
        System.out.println("Volebni cisplo: " + volebniCislo);

        int mandatuA = hlasuA / volebniCislo;
        int mandatuB = hlasuB / volebniCislo;
        int mandatuC = hlasuC / volebniCislo;
        int mandatuD = hlasuD / volebniCislo;

        System.out.println("Mandatu A: " + mandatuA);
        System.out.println("Mandatu B: " + mandatuB);
        System.out.println("Mandatu C: " + mandatuC);
        System.out.println("Mandatu D: " + mandatuD);



    }
}
