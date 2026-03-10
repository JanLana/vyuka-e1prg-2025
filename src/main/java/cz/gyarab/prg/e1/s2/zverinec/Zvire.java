package cz.gyarab.prg.e1.s2.zverinec;

public abstract class Zvire {
    public String jmeno;

    //public Zvire() {}
    public Zvire(String j) {
        jmeno = j;
    }

    abstract public String delaZvuk();
    abstract public int cenaZradla();

    public void vypisSe() {
        System.out.println("Jmenuji se: " + jmeno);
        System.out.println("Dela zvuk: " + delaZvuk());
    }
}
