package zadanieComparator;

import java.awt.*;
import java.util.ArrayList;
//Stwórz klasę Osoba (String imie, String nazwisko, int wiek), a
// następnie stwórz dla niego Comparator, który sortuje osoby po wieku.
//W mainie stwórz kilka instancji klasy osoba i dodaj je do Listy.
// Po dodaniu posortuj listę i na ekran wypisz  wynik przed sortowaniem,
// oraz po sortowaniu.
public class Main {
    private static Object Osoba;

    public static void main(String[] args) {
        List <> osobas= new ArrayList<>();
        Osoba = new Osoba("Jan", "Nowak", 30);
        Osoba = new Osoba("Dorota", "Kowalska", 25);
        Osoba = new Osoba("Józef", "Noga", 80);

    }
}
