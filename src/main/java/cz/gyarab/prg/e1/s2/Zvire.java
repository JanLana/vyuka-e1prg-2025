package cz.gyarab.prg.e1.s2;

public  class Zvire {
    public String jmeno;


     public int pocetNohou() {
        return -1;
    }

    public String delaZvuk() {
         return "????";
    }

    public void karticka() {
        String radek0 = "Jmeno: " + jmeno;
        String radek1 = "Nohou: " + pocetNohou();
        String radek2 = "Zvuk: " + delaZvuk();

        int kolikZnakuManejdelsiRadek;

        if (radek0.length() > radek1.length()) {
            kolikZnakuManejdelsiRadek = radek0.length();
        } else {
            kolikZnakuManejdelsiRadek = radek1.length();
        }

        namalujCaru(kolikZnakuManejdelsiRadek);

        System.out.println("* " + radek0 + " *");
        System.out.println("* " + radek1 + " *");

        namalujCaru(kolikZnakuManejdelsiRadek);


    }

    public void namalujCaru(int kolikZnakuManejdelsiRadek) {
        for (int i = 0; i < kolikZnakuManejdelsiRadek +4; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
