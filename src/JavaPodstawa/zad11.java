package JavaPodstawa;

import java.util.Scanner;

public class zad11 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj wartość produktu: ");
        double productValue = scanner.nextDouble();

        double stateTax = 0.04 * productValue;
        double localTax = 0.02 * productValue;
        double totalTax = stateTax + localTax;
        double totalPrice = productValue + totalTax;

        System.out.println("Wartość produktu: " + productValue);
        System.out.println("Podatek stanowy: " + stateTax);
        System.out.println("Podatek lokalny: " + localTax);
        System.out.println("Łączna cena sprzedaży: " + totalPrice);
    }
}
