package cz.gyarab.prg.e1.s2;

public class Mrkodrap {
    public static void main(String[] args) {
        for (int i = 1; i < 163; i++) {
            if (i == 13) {

            } else if (i < 10) {
                System.out.print("   " + i + ". patro");
            } else if (i < 100) {
                System.out.print(" " + i + ". patro");
            } else {
                System.out.print(i + ". patro");
            }
        }
    }
}
