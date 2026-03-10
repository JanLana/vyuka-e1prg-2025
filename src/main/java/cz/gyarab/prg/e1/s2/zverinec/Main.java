package cz.gyarab.prg.e1.s2.zverinec;

public class Main {
    public static void main(String[] args) {
        System.out.println("vyrabim alika");


        //int[] arrInt = new int[10];
        //Pes[] arr = new Pes[3];
        //arr[0] = new Pes("alik");
        //arr[1] = new Pes("vorech");
        //arr[2] = new Pes("aaa");

        Zvire[] arr = {
                new Pes("alik"),
                new Pes("vorech"),
                new Pes("aaa"),
                new Kocka("mica"),
                new Uzovka(),
                new Rybicka(),
                new Rybicka(),
        };

        int hodnota = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i].vypisSe();
            hodnota = hodnota + arr[i].cenaZradla();
        }
        System.out.println("Vsichni dohromady stoji: " + hodnota);

    }
}
