package ZadaniaPetle2;
import java.util.Scanner;

public class petle10 {

    public static void main(String[] args) {
        Scanner klawisz = new Scanner(System.in);

        int maxWartosc = Integer.MIN_VALUE;
        int minWartosc = Integer.MAX_VALUE;

        System.out.println("Wprowadź liczby całkowite (wpisz -99, aby zakończyć):");

        int numer;
        do {
            numer = klawisz.nextInt();

            if (numer != -99) {
                if (numer > maxWartosc) {
                    maxWartosc = numer;
                }
                if (numer < minWartosc) {
                    minWartosc = numer;
                }
            }

        } while (numer != -99);

        System.out.println("Największa wartość: " + maxWartosc);
        System.out.println("Najmniejsza wartość: " + minWartosc);

        klawisz.close();
    }

}