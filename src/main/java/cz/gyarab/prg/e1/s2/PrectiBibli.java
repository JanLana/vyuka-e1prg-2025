package cz.gyarab.prg.e1.s2;

import java.io.File;
import java.io.FileNotFoundException;
import java.security.spec.RSAOtherPrimeInfo;
import java.util.*;

public class PrectiBibli {
    public static void main(String[] args) {
        String jmenoSouboru = "complet.txt";
        File soubor = new File(jmenoSouboru);
        Scanner sc = null;

        Set seznamSlov = new HashSet();

        long casStart = System.currentTimeMillis();
        long pocetSlov = 0;
        try {
            sc = new Scanner(soubor);

            while (sc.hasNext()) {
                pocetSlov++;
                String slovo = sc.next();
                seznamSlov.add(slovo);

                //if (uzJsmeTohleSlovoVideli(slovo, seznamSlov) == false) {
                //if (seznamSlov.contains(slovo)  == false ) {
                //    seznamSlov.add(slovo);
                    //    System.out.println(pocetSlov + " / " + seznamSlov.size());
                //}
            }
        } catch (FileNotFoundException e) {
            System.out.println("Soubor " + jmenoSouboru + " neexistuje!");
        }

        //char[] abeceda = { 'a', 'b', 'c'};
        char[] abeceda = "abcdefghijklmnopqrstuvwxyz".toCharArray();

        for(char ch : abeceda) {

            int n = 0;

            //for (int i = 0; i < seznamSlov.size(); i++) {
            //    String slovo = (String) seznamSlov.get(i);

            //Iterator it = seznamSlov.iterator();
            //while(it.hasNext()) {
            //    String slovo = (String)it.next();
            for (Object sl : seznamSlov) {
                String slovo = (String) sl;

                if (slovo.charAt(0) == ch) {
                    n++;
                }
            }
            System.out.println("pocet slov na '" + ch + "': " + n);
        }


        long casEnd = System.currentTimeMillis();

        System.out.println("Delka behu: " + (casEnd - casStart));

        System.out.println(seznamSlov.size());
        System.out.println(pocitadlo);

    }

    static long pocitadlo = 0;

    private static boolean uzJsmeTohleSlovoVideli(String slovo, List arr) {
        for (int i = 0; i < arr.size(); i++) {
            String znameSlovo = (String) arr.get(i);

            pocitadlo++;
            if (slovo.equals(znameSlovo)) {
                return true;
            }
        }

        return false;
    }
}
