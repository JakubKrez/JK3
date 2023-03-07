package ZadaniaPetle2;
import java.util.Scanner;

public class petle9 {
    public static void main(String[] args) {
        Scanner klawisz = new Scanner(System.in);
        int populacja;
        do{
            System.out.println("Podaj początkową liczbę organizmów: ");
            populacja = klawisz.nextInt();
        }while (populacja<2);

        double przyrost;
        do {
            System.out.println("Podaj średni dzienny przyrost populacji w %: ");
            przyrost = klawisz.nextInt();
        }while (przyrost<0);

        int dni;
        do {
            System.out.println("Podaj liczbe dni rozmnażania (min1): ");
            dni = klawisz.nextInt();
        }while (dni<1);

        System.out.println("Wielkość populacji przez "+dni+ " dni:");
        for (int i = 1; i<=dni; i++){
            populacja += populacja * (przyrost/100);
            System.out.println("Dzień "+i+ " " + populacja + " organizmów");

        }
    }
}
