package ZadaniaIF;

import java.util.Scanner;

public class if9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Podaj wagę przesyłki (w kg): ");
        double waga = input.nextDouble();

        System.out.print("Podaj odległość przesyłki (w km): ");
        double odleglosc = input.nextDouble();
        double oplata;

        if (waga <= 1) {
            oplata = 1.10;
        } else if (waga <= 3) {
            oplata = 2.20;
        } else if (waga <= 5) {
            oplata = 3.70;
        } else {
            oplata = 3.80;
        }

        int ilosc500km = (int) Math.ceil(odleglosc / 500);
        double koszt = oplata * ilosc500km;

        System.out.println("Koszt przesyłki wynosi: " + koszt + " zł");
    }
}