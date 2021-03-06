import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* ćw 1 enum-y */

        /* zad.1
        a) Stworzyć prosty enum "LiczbyEnum" z liczbami od 1 do 6 zapisanymi słownie,
        b) stworzyć prosty enum "StatusEnum" z wartościami KONTYNUUJEMY i KONIEC,
        c) stworzyć pętlę while z wartością true w warunku (nieskończona pętla),
        d) niech w pętli są podawane wartości liczbowe z klawiatury,
        e) jeśli użytkownik poda z klawiatury 0 to program ma kończyć działanie,
        f) umieścić w pętli switch() case: które będą wypisywały cyfry słownie odpowiednio
        do podanych cyfr przez użytkownika,
        g) gdy użytkownik wciśnie 0 ma wyświetlić się status KONIEC w innym wypadku KONTYNUUJEMY :),
        */

        /* statusy i wybór ze switch case to najczęstsze użycia enumów, enumy są często używane
        * w różnego rodzaju listach, selectach jako krótkie opcje wyboru np. jako status A, X (Aktualny, Usunięty) */

        Scanner wpisz = new Scanner(System.in);
        System.out.println("Wpisz liczby od 1 do 6: ");
        while(true){
            int a = wpisz.nextInt();

            switch (a) {
                case 1 -> System.out.print(LiczbyEnum.JEDEN + "\n");
                case 2 -> System.out.print(LiczbyEnum.DWA + "\n");
                case 3 -> System.out.print(LiczbyEnum.TRZY + "\n");
                case 4 -> System.out.print(LiczbyEnum.CZTERY + "\n");
                case 5 -> System.out.print(LiczbyEnum.PIEC + "\n");
                case 6 -> System.out.print(LiczbyEnum.SZESC + "\n");
            }
            if (a>6) System.out.println("Tylko liczby od 1 do 6: ");
            if (a == 0){System.out.println(StatusEnum.KONIEC);}
            else System.out.println(StatusEnum.KONTYNUUJEMY);
            if (a == 0) return;
        }
    }

    enum LiczbyEnum {JEDEN,DWA,TRZY,CZTERY,PIEC,SZESC}

    enum StatusEnum {KONTYNUUJEMY, KONIEC}
}
