package cz.gyarab.prg.e1.s1;

public class Politik extends Clovek {
    String pozice;

    public Politik(String j, String pr, int v, String po) {
        jmeno = j;
        prijmeni = pr;
        vek = v;
        pozice = po;
    }

    public void vypisSe() {
        vypisSeClovek();
        System.out.println(" Pozice: " + pozice);
    }

    public static void main(String[] args) {
        Politik[] arr = new Politik[2];

        arr[0] = new Politik("Andrej", "Babis", 71, "predseda");
        arr[1] = new Politik("Karel", "Havlicek", 56, "ministr prumyslu");

        for (int i = 0; i < arr.length; i++) {
            //arr[i].vypisSePolitik();
        }


        /*
        arr[0].jmeno = "Andrej";
        arr[0].prijmeni = "Babis";
        arr[0].vek = 71;
        arr[0].pozice = "predseda vlady";
         */


    }
}
