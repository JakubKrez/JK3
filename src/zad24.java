import java.util.Scanner;
public class zad24 {
    public static void main(String[] args) {
        Scanner klawisz = new Scanner(System.in);
        System.out.println("Wprowadź długość rzędu w metrach: ");
        double rzad = klawisz.nextDouble();
        System.out.println("Ilość zajmowanego miejsca przez okratowanie w metrach: ");
        double okratowanie = klawisz.nextDouble();
        System.out.println("Odległość między sadzonkami w metrach: ");
        double odleglosc = klawisz.nextDouble();
        double sadzonki = (rzad-2*okratowanie)/odleglosc;
        System.out.println("Liczba sadzonek która zmieści się w rzędzie: "+sadzonki);
    }
}
