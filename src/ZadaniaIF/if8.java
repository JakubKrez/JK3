package ZadaniaIF;

import java.util.Scanner;

public class if8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final double CENA_PAKIETU = 99.0;
        double rabat, cenaZrabatem;

        System.out.print("Podaj liczbę zakupionych pakietów: ");
        int liczbaPakietow = scanner.nextInt();

        if (liczbaPakietow >= 10 && liczbaPakietow <= 19) {
            rabat = 0.2;
        } else if (liczbaPakietow >= 20 && liczbaPakietow <= 49) {
            rabat = 0.3;
        } else if (liczbaPakietow >= 50 && liczbaPakietow <= 99) {
            rabat = 0.4;
        } else if (liczbaPakietow >= 100) {
            rabat = 0.5;
        } else {
            rabat = 0.0;
        }

        cenaZrabatem = CENA_PAKIETU * liczbaPakietow * (1.0 - rabat);

        if (rabat > 0.0) {
            System.out.printf("Przyznano rabat %.0f%%\n", rabat * 100.0);
        }
        System.out.printf("Łączna kwota zakupu po rabacie: %.2f zł", cenaZrabatem);
    }
}