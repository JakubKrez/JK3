package ZadaniaPetle2;
import java.util.Scanner;

public class petla1 {
    public static void main(String[] args) {
        Scanner klawisz = new Scanner(System.in);
        System.out.println("Podaj liczbe dodatnia nie zerowa calkowita: ");
        int liczba = klawisz.nextInt();
        int suma =0;

        for (int i=1; i<=liczba; i++) {
            suma += i;

        }
        System.out.println(suma);
    }
}
