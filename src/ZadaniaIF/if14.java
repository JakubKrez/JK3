package ZadaniaIF;
import java.util.Scanner;
public class if14 {
    public static void main(String[] args) {
        Scanner klawisz = new Scanner(System.in);
        System.out.println("Wprowadź litere reprezentujaca pakiet: (A/B/C)");
        String litera = String.valueOf(klawisz.nextLine().toUpperCase().charAt(0));
        System.out.println("Wprowadź liczbe minut rozmów: ");
        int liczba = klawisz.nextInt();
        double cenaa = 39.99;
        double cenab = 59.99;
        double cenac = 69.99;
        double sumaa = cenaa + (liczba-450)*0.45;
        double sumab =cenab + (liczba-900)*0.40;
        switch (litera) {
            case "A" -> {
                if (liczba <= 450){
                    System.out.println("Cena " + cenab);
                }
                if (liczba > 450){
                    System.out.println("Cena " + sumaa);
                }
                if (sumaa > sumab) {
                    double sumson = sumaa - sumab;
                    System.out.println("Korzystajac z pakietu B zaoszczedzilbys: "+sumson);
                    double sumson1 = sumaa - cenac;
                    System.out.println("Korzystajac z pakietu C zaoszczedzilbys: "+sumson1);
                }
            }
            case "B" -> {
                if (liczba <= 900) {
                    System.out.println("Cena " + cenab);
                }

                if (liczba > 900){

                    System.out.println("Cena " + sumab);
                }
                if (sumab > cenac){
                    double sumsonb = sumab - cenac;
                    System.out.println("Korzystajac z pakietu C zaoszczedzilbys: "+sumsonb);
                }

            }
            case "C" -> {
                double cenaD = 69.99;
                System.out.println("Cena " + cenaD);
            }
        }
    }
}