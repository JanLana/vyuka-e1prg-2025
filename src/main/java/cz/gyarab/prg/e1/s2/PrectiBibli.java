package cz.gyarab.prg.e1.s2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class PrectiBibli {
    public static void main(String[] args) {
        String jmenoSouboru = "complet.txt";
        File soubor = new File(jmenoSouboru);
        Scanner sc = null;
        ArrayList arr = new ArrayList<>();

        try {
            sc = new Scanner(soubor);

            while (sc.hasNext()) {
                String slovo = sc.next();

                if (uzJsmeTohleSlovoVideli(slovo, arr) == false) {
                    arr.add(slovo);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Soubor " + jmenoSouboru + " neexistuje!");
        }

        System.out.println(arr.size());
        System.out.println(pocitadlo);

    }

    static long pocitadlo = 0;

    private static boolean uzJsmeTohleSlovoVideli(String slovo, ArrayList arr) {
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
