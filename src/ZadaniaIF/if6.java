package ZadaniaIF;
import java.util.Scanner;

public class if6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbę sekund: ");
        int sekund = scanner.nextInt();

        int minut = 0;
        int godzin = 0;
        int dni = 0;

        if (sekund >= 86400) {
            dni = sekund / 86400;
            sekund %= 86400;
        }
        if (sekund >= 3600) {
            godzin = sekund / 3600;
            sekund %= 3600;
        }
        if (sekund >= 60) {
            minut = sekund / 60;
            sekund %= 60;
        }

        System.out.printf("%d sekund to %d dni, %d godzin, %d minut i %d sekund.",
                sekund + minut * 60 + godzin * 3600 + dni * 86400, dni, godzin, minut, sekund);
    }
}
