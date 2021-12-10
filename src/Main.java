import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* ćw 3 klasy */

        /*  zad.1 - Najpierw należy uzupełnić kod w klasie Punkt.java,
            a) stworzyć objekt punktA typu Punkt,
            w konstruktorze zainicjować zmienną pX --> np. new Punkt(7), wykonać metodę punktA.toString();
            b) następnie ponownie wywopać konstruktor inicjalizujący wszystkie pola z klasy
            --> np. punkt = new Punkt(1, 2, 3);, wykonać metodę punktA.toString();
            c) nadpisać wartości pól z objektu punktA za pomocą setterów i
            ponownie wywołać metodę toString();
            d) wypisać wartości pól (za pomocą getterów),
            e) wywołać metody suma i róznica (obie wersje) z klasy punkt
        */

        Punkt punktA = new Punkt(7);

        System.out.println(punktA.toString());

        Punkt punktB = new Punkt(1,2,3);

        System.out.println(punktB.toString());

        punktA.setpX(8);
        punktA.setpY(5);
        punktA.setpZ(2);

        System.out.println(punktA.toString());
        System.out.println("pX: " + punktA.getpX() + ", pY: " + punktA.getpY() + ", pZ: " + punktA.getpZ());

        System.out.println("Suma to: " + punktA.suma());
        System.out.println("Roznica 1 to: " + punktA.roznica());
        System.out.println("Roznica 1 to: " + punktA.roznica(3,2,4));



    }
}
