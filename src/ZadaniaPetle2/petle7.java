package ZadaniaPetle2;
import java.util.Scanner;

public class petle7 {

    public static void main(String[] args) {
        Scanner klawisz = new Scanner(System.in);

        int numerPokojow;
        do {
            System.out.print("Podaj liczbę pięter w hotelu (minimum 1): ");
            numerPokojow = klawisz.nextInt();
        } while (numerPokojow < 1);

        int wszystkiePokoje = 0;
        int zajetePokoje = 0;

        for (int i = 1; i <= numerPokojow; i++) {
            int numerPokojowNaPietrze;
            int numerZajetchPokojownaPietrze;

            do {
                System.out.printf("Podaj liczbę wszystkich pokojów na %d piętrze (minimum 10): ", i);
                numerPokojowNaPietrze = klawisz.nextInt();
            } while (numerPokojowNaPietrze < 10);

            do {
                System.out.printf("Podaj liczbę zajętych pokojów na %d piętrze: ", i);
                numerZajetchPokojownaPietrze = klawisz.nextInt();
            } while (numerZajetchPokojownaPietrze < 0 || numerZajetchPokojownaPietrze > numerPokojowNaPietrze);

            wszystkiePokoje += numerPokojowNaPietrze;
            zajetePokoje += numerZajetchPokojownaPietrze;
        }

        int emptyRooms = wszystkiePokoje - zajetePokoje;
        double occupancyRate = (double) zajetePokoje / wszystkiePokoje;

        System.out.printf("Łączna liczba pokojów w hotelu: %d%n", wszystkiePokoje);
        System.out.printf("Liczba zajętych pokojów: %d%n", zajetePokoje);
        System.out.printf("Liczba wolnych pokojów: %d%n", emptyRooms);
        System.out.printf("Poziom obłożenia hotelu: %.2f%n", occupancyRate);
    }
}