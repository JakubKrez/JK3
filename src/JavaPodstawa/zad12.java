package JavaPodstawa;

import java.util.Scanner;

public class zad12 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbę przejechanych kilometrów: ");
        double distance = scanner.nextDouble();
        System.out.print("Podaj liczbę zużytych litrów paliwa: ");
        double fuel = scanner.nextDouble();

        double fuelEfficiency = distance / fuel;
        System.out.println("Liczba kilometrów przejechanych na litrze paliwa: " + fuelEfficiency);
    }
}
