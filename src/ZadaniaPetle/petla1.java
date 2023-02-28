package ZadaniaPetle;
import java.util.Scanner;

public class petla1 {

    public static void main(String[] args) {
        Scanner klawisz = new Scanner(System.in);
        int liczba;
        boolean poprawnaLiczba = false;

        while (!poprawnaLiczba) {
            System.out.println("Wprowadź liczbę z przedziału od 10 do 24:");
            liczba = klawisz.nextInt();

            if (liczba >= 10 && liczba <= 24) {
                poprawnaLiczba = true;
            } else {
                System.out.println("Wprowadzona liczba nie należy do przedziału od 10 do 24.");
            }
        }

        System.out.println("Wprowadzona liczba jest poprawna.");
    }
}