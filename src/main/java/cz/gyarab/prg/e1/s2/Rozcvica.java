package cz.gyarab.prg.e1.s2;

public class Rozcvica {


    public static void main(String[] args) {
        System.out.println("Dnesni hodina");
        znakyZaSebou("=", 13);
        System.out.println();
    }

    private static void znakyZaSebou(String s, int i) {
        for (int j = 0; j < i; j++) {
            System.out.print(s);
        }
    }


    public void obdelnicek(String s, int sloupcu, int radek) {
        znakyZaSebou(s, sloupcu);
        System.out.println();

        System.out.print(s);
        znakyZaSebou(" ", sloupcu - 2);
        System.out.println(s);

        znakyZaSebou(s, sloupcu);
        System.out.println();

    }
    //Dnesni hodina
    //=============
}
