package Emberek;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Ember human = new Ember("Gipsz Jakab","2001-1-1","Budapest");
        Ember human2 = new Ember("Teszt Elek","1985-12-15","Debrecen");
        Ember human3 = new Ember("Kovács István","1999-3-30","Szeged");
        Ember human4 = new Ember("Kovács Roland","1989-3-30","Szekszárd");
        Ember human5 = new Ember("Nagy István","1969-3-30","Debrecen");
        Emberek emberek = new Emberek(new Ember[]{human, human2, human3, human4, human5});
        //System.out.println(emberek);
        String fajlNev = "emberek.txt";
        try {
            Emberek emberek2 = new Emberek(fajlNev);
        } catch (FileNotFoundException e) {
            System.err.printf("Hiba nem található a(z) %s fájl\n", fajlNev);
        } catch (IOException e){
            System.err.println("Ismeretlen hiba történt a fájl beolvasása során.");
        }
    }
}
