import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        /* ćw 5 Dziedziczenie */

        /* zad.1 Proszę wybrać dowolny temat budowania struktur klas np. samochody, dom, biblioteka, nauka, zabawki, kosmetyki, biuro podróży ... .
                 Będziemy budować podobną strukturę kodu jak w przykładzie 5,
            a) Proszę stworzyć układ klas dziedziczących po sobie,
            b) proszę użyć pól i metod protected jak i private,
            c) proszę stworzyć konstruktory, metody: toString(), settery i gettery,
            d) proszę używać super do wywołania konstruktorów i metod z klas nadrzędnych
            (można wygenerować je --> prawy przycisk myszki --> generate --> settery, gettery, ...),
            e) w klasie Main proszę stworzyć objekty podobnie jak w przykładzie 5,
            oraz stworzyć listę typu najbardziej generycznego np. List<Budynek>
         */

        Budynek mieszkanie = new Budynek("ul. Grunwaldzka 15", 45.9);
        System.out.println(mieszkanie.toString());
        System.out.println("Czynsz wynosi: " + mieszkanie.czynsz());

        Szkola podstawowa = new Szkola("ul. Czarneckiego 68",950.75, 5);
        System.out.println(podstawowa.toString());
        System.out.println(podstawowa.czynsz());

        Szkola liceum = new Szkola ("ul. Warynskiego 23",780, 4);
        System.out.println(liceum.toString());
        System.out.println(liceum.czynsz());

        Universytet gdanski = new Universytet("ul. Bazynskiego 8", 50228.5,7,"Uniwersytet Gdanski");
        System.out.println(gdanski.toString());
        System.out.println(gdanski.czynsz());

        List <Budynek> listaBudynkow = new ArrayList<>();

        listaBudynkow.add(mieszkanie);
        listaBudynkow.add(podstawowa);
        listaBudynkow.add(liceum);
        listaBudynkow.add(gdanski);

        System.out.println(listaBudynkow);


    }
}
