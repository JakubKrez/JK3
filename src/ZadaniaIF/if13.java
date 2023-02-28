package ZadaniaIF;
import java.util.Scanner;
public class if13 {
    public static void main(String[] args) {
        Scanner klawisz = new Scanner(System.in);
        System.out.println("Wprowadź litere reprezentujaca pakiet: (A/B/C)");
        String litera = String.valueOf(klawisz.nextLine().toUpperCase().charAt(0));
        System.out.println("Wprowadź liczbe minut rozmów: ");
        int liczba = klawisz.nextInt();

        switch (litera) {
            case "A" -> {
                double cenaa = 39.99;
                if (liczba > 450){
                    double sumaa = cenaa + (liczba-450)*0.45;
                    System.out.println("Cena " + sumaa);
                }
            }
            case "B" -> {
                double cenab = 59.99;
                if (liczba > 900){
                    double sumab =cenab + (liczba-900)*0.40;
                    System.out.println("Cena " +sumab);
                }

            }
            case "C" -> {
                double cenac = 69.99;
                System.out.println("Cena " +cenac);
            }
        }
    }
}
