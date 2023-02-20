import java.util.Scanner;
public class zad18 {
    public static void main(String[] args) {
        Scanner klawisz = new Scanner(System.in);
        System.out.println("Wprowadź cenę posiłku: ");
        int cena = klawisz.nextInt();
        System.out.println(cena +" zł");

        double podatek = cena * 0.0675;
        System.out.println(podatek + " zł");

        double napiwek = (cena + podatek) * 0.2;
        System.out.println(napiwek+ " zł");
        double lacznie = cena + podatek + napiwek;
        System.out.println(lacznie + " zł");



    }
}
