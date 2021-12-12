import java.util.*;

public class Main {

    public static void main(String[] args) {
        /* ćw 4 klasy */

        /* zad.1
            a) Stworzyć klasę Osoba z polami prywatnymi:
            - imie (String),
            - nazwisko (String),
            - indeks (Integer)

            b) stworzyc konstruktory, gettery i settery
            c) napisać metodę w klasie Osoba która zwróci informację o osobie,
         */

        /* zad.2
            a) Stworzyć klasę Student z polami prywatnymi
            - Osoba osoba,
            - WydzialEnum wydzial;
            b) stworzyć enum WydzialEnum (w nowym pliku) z kilkoma polami,
            c) stworzyc konstruktory, gettery i settery
            d) nadpisać metodę toString aby zwracała wszystkie elementy ładnie przedstawione :)
         */

        /* zad.3
            a) W klasie Main stworzyć 5 różnych studentów, (można za pomocą tego samego objektu)
            b) dodać studentów do Listy ArrayList,
            c) przeiterować listę za pomocą pętli forEach wywołując na każdym objekcie metodę toString() (w każdej iteracji);
         */

        /*
        Osoba ana = new Osoba("Anna", "Kowalska", 12345);
        Student s1 = new Student(ana, WydzialEnum.BIZNES);
        System.out.println(s1.toString());
        */
        List<Object>listaStudentow = new ArrayList<>();
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
        Student s4 = new Student();
        Student s5 = new Student();

        s1.setOsoba(new Osoba("Anna","Kowalska", 1234));
        s1.setWydzial(WydzialEnum.BIZNES);
        //System.out.println(s1.toString());
        listaStudentow.add(s1);

        s2.setOsoba(new Osoba("Marek", "Nowak", 4321));
        s2.setWydzial(WydzialEnum.ADMINISTRACJA);
        listaStudentow.add(s2);

        s3.setOsoba(new Osoba("Andrzej", "Wisniewski", 7890));
        s3.setWydzial(WydzialEnum.INFORMATYKA);
        listaStudentow.add(s3);

        s4.setOsoba(new Osoba("Patryk", "Michalski", 1209));
        s4.setWydzial(WydzialEnum.INFORMATYKA);
        listaStudentow.add(s4);

        s5.setOsoba(new Osoba("Ewa", "Sikorska", 9876));
        s5.setWydzial(WydzialEnum.BIZNES);
        listaStudentow.add(s5);

        for(Object student: listaStudentow){
            System.out.println(student.toString());
        }
    }
}
