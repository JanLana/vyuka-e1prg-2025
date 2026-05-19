package cz.gyarab.prg.e1.s1;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class NactiZeSouboru {
    public static void main(String[] args) throws IOException {
        //Path cesta = Paths.get("C:/Users/lana/IdeaProjects/vyuka-e1prg-2025/seznam.txt");
        Path cesta = Paths.get("seznam.txt");
        BufferedReader reader = Files.newBufferedReader(cesta);
        String line = reader.readLine();
        System.out.println(line);
        reader.close();
    }
}
