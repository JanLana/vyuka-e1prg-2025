package cz.gyarab.prg.e1.s2;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class NactiSeznam {
    public static void main(String[] args) throws IOException {
        //Path cesta = Paths.get("C:/Users/lana/IdeaProjects/vyuka-e1prg-2025/seznamZaku.txt");
        Path cesta = Paths.get("seznamZaku.txt");

        BufferedReader reader = Files.newBufferedReader(cesta);
        String radek = reader.readLine();
        System.out.println(radek);
        reader.close();
    }
}