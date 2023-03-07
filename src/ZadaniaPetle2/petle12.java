package ZadaniaPetle2;
import java.util.Scanner;

public class petle12 {
    public static void main(String[] args) {
        Scanner klawisz = new Scanner(System.in);
        System.out.print("Podaj dzisiejszą wartość sprzedaży dla sklepu nr 1: ");
        int sklep1 = klawisz.nextInt();
        System.out.print("Podaj dzisiejszą wartość sprzedaży dla sklepu nr 2: ");
        int sklep2 = klawisz.nextInt();
        System.out.print("Podaj dzisiejszą wartość sprzedaży dla sklepu nr 3: ");
        int sklep3 = klawisz.nextInt();
        System.out.print("Podaj dzisiejszą wartość sprzedaży dla sklepu nr 4: ");
        int sklep4 = klawisz.nextInt();
        System.out.print("Podaj dzisiejszą wartość sprzedaży dla sklepu nr 5: ");
        int sklep5 = klawisz.nextInt();

        double sklepik1 = sklep1 / 100;
        System.out.print("Sklep nr 1: ");
        for(int i=1;i<=sklepik1; i++) {
            System.out.print("*");
        }
        double sklepik2 = sklep2 / 100;
        System.out.print("\nSklep nr 2: ");
        for(int i=1;i<=sklepik2; i++) {
            System.out.print("*");
        }
        double sklepik3 = sklep3 / 100;
        System.out.print("\nSklep nr 3: ");
        for(int i=1;i<=sklepik3; i++) {
            System.out.print("*");
        }
        double sklepik4 = sklep4 / 100;
        System.out.print("\nSklep nr 4: ");
        for(int i=1;i<=sklepik4; i++) {
            System.out.print("*");
        }
        double sklepik5 = sklep5 / 100;
        System.out.print("\nSklep nr 5: ");
        for(int i=1;i<=sklepik5; i++) {
            System.out.print("*");
        }

    }
}
