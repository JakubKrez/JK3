import java.util.Scanner;

public class zad16 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj cenę detaliczną płytki: ");
        double retailPrice = scanner.nextDouble();

        double profit = retailPrice * 0.4;
        System.out.println("Zysk ze sprzedaży wynosi: " + profit);

    }
}