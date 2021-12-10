import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* ćw 2 klasy */
        /* zad.1
            a) Stworzyć publiczną klasę Student z 2-ma polami String, 1 polem int i 1 polem boolean,
            klasa ma się znajdować w osobnym pliku Student.java
            b) stworzyć 3 objekty klasy student i wstawić je do tablicy
            c) wyświetlić dane z tablicy, użyć pętli for lub forEach
            d) dane powinny być estetycznie przedstawione
         */


        List<Student> listaStudentow = new ArrayList<>();

        Student p = new Student();
        p.imie = "Marek";
        p.nazwisko = "Kowalski";
        p.album = 12345;
        p.stacjonarny = false;
        listaStudentow.add(p);

        Student d = new Student();
        d.imie = "Andrzej";
        d.nazwisko ="Wisniewski";
        d.album = 98768;
        d.stacjonarny= true;
        listaStudentow.add(d);

        Student t = new Student();
        t.imie = "Anna";
        t.nazwisko = "Nowak";
        t.album = 67890;
        t.stacjonarny = true;
        listaStudentow.add(t);

        for (Student x : listaStudentow){
            System.out.println(" Student: " + x.imie + " " + x.nazwisko + ", nr albumu: " + x.album + ", tryb stacjonarny: " + x.stacjonarny);
        }

    }
}
