package cz.gyarab.prg.e1.s1.zverinec;

abstract public class Zvire {
    String jmeno;

    abstract public String delaZvuk();



    public void vypisSe() {
        System.out.println("Jmeno: " + jmeno);
        System.out.println("Dela zvuk: " + delaZvuk());
    }
}
