package ZadaniaIF;
import java.util.Scanner;
public class if2 {
    public static void main(String[] args) {
        Scanner klawisz = new Scanner(System.in);
        System.out.println("Podaj dzień: ");
        int dzien = klawisz.nextInt();
        System.out.println("Podaj miesiąc(W formie liczby): ");
        int miesiac = klawisz.nextInt();
        System.out.println("Podaj dwie ostatnie cyfry roku: ");
        int rok = klawisz.nextInt();

        int magia = dzien * miesiac;
        if (rok == magia){
            System.out.println("Ta data jest magiczna");
        }else {
            System.out.println("Ta data nie jest magiczna");
        }

    }
}
