package ZadaniaIF;
import java.util.Scanner;
public class if10 {
    public static void main(String[] args) {
        Scanner klawisz = new Scanner(System.in);
        System.out.println("Wprowadź liczbe kalorii: ");
        double kalorie = klawisz.nextDouble();
        System.out.println("Wprowadź liczbe gramów tłuszczu w produkcie: ");
        double tluszcz = klawisz.nextDouble();
        double kaloriezt = tluszcz * 9;
        double procentkzt =(kaloriezt/kalorie)*100;
        if (kaloriezt < 0.30){
            System.out.println("Produkt jest niskotłuszczowy ");
        }
        if (kaloriezt > kalorie){
            System.out.println("Dane wejściowe są nieprawidłowe ");
        }
        System.out.println("Procent kalorii pochodzących z tłuszczu wynosi: "+procentkzt + "%");

    }
}
