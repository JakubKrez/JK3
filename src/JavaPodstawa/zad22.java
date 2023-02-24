package JavaPodstawa;

import  java.util.Scanner;
public class zad22 {
    public static void main(String[] args) {
        Scanner klawisz = new Scanner(System.in);
        System.out.println("Wprowadz kwotę pieniędzy początkowo zdeponowanej na koncie: ");
        double kwota = klawisz.nextDouble();
        System.out.println("Wprowadz roczną stopę oprocentowania: ");
        double stopa = klawisz.nextDouble();
        stopa = stopa/100;
        System.out.println("Ile razy w roku kapitalizujesz odsetki(przy kapitalizacji miesięcznej wpisz 12,\n" +
                "a przy kapitalizacji kwartalnej — 4): ");
        double odsetki = klawisz.nextDouble();
        System.out.println("Ile lat środki będą znajdować się na koncie?: ");
        double lata = klawisz.nextDouble();
        double Kasa = kwota*Math.pow((1+stopa/odsetki), odsetki*lata);
        System.out.println("Środki na koncie po upływie czasu: "+Kasa);
    }
}
