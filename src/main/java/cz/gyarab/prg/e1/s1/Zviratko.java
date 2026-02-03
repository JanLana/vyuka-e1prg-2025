package cz.gyarab.prg.e1.s1;

public class Zviratko {
    String jmeno;

    public String delaZvuk() {
        return "?!?!?!?!";
    }

    public int maNohou() {
        return 0;
    }

    public void kartaZviete() {
        String[] radek = new String[3];
        radek[0] = "Jmeno: " + jmeno;
        radek[1] = "Pocet nohou: " + maNohou();
        radek[2] = "Dela zvuk: " + delaZvuk();

        int nejdelsi = getNejdelsi(radek);
        namalujCaru(nejdelsi);

        for (int i = 0; i < radek.length; i++) {
            System.out.println("* " + radek[i] + " *");
        }

        namalujCaru(nejdelsi);
    }

    public int getNejdelsi(String[] radek) {
        int nejdelsi;
        if (radek[0].length() > radek[1].length()) {
            nejdelsi = radek[0].length();
        } else {
            nejdelsi = radek[1].length();
        }

        if (radek[2].length() > nejdelsi) {
            nejdelsi = radek[2].length();
        }
        return nejdelsi;
    }

    public void namalujCaru(int nejdelsi) {
        for (int i = 0; i < nejdelsi + 4; i++) {
            System.out.print('*');
        }
        System.out.println();
    }
}
