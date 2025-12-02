package cz.gyarab.prg.e1.s1;

public class Malovani {
    public static void vypis(String znakKVypsani, int kolikrat) {
        for (int i = 0; i < kolikrat; i++) {
            System.out.print(znakKVypsani);    // co bude metoda delat
        }

    }


    public static void main(String[] args) {
        vypis("*", 10);
        System.out.println();

        vypis("+", 33);
        System.out.println();


        //vypis("*", 2);
        //vypis(" ", 6);
        //vypis("*", 2);
        //System.out.println();
        //vypis("*", 10);

    }
}
