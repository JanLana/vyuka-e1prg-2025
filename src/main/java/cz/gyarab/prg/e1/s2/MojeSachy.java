package cz.gyarab.prg.e1.s2;

public class MojeSachy {

    public static void main(String[] args) {
        SachovaFigurka p1 = new SachovaFigurka();
        SachovaFigurka dama = new SachovaFigurka();

        p1.inicializace("kůň", true, 7, 'c');
        p1.vypisSe();
        p1.pohniSeDolu();
        p1.pohniSeDolu();
        p1.pohniSeDoprava();
        p1.vypisSe();

        dama.inicializace("dáma", false, 1, 'd');
        dama.vypisSe();
    }
}
