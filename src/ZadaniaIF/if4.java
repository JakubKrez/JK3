package ZadaniaIF;

import java.util.Scanner;
public class if4 {
    public static void main(String[] args) {
        Scanner klawisz = new Scanner(System.in);
        System.out.println("Podaj wynik sprawdzianu 1: ");
        double test1 = klawisz.nextDouble();
        System.out.println("Podaj wynik sprawdzianu 1: ");
        double test2 = klawisz.nextDouble();
        System.out.println("Podaj wynik sprawdzianu 1: ");
        double test3 = klawisz.nextDouble();
        double srednia = (test1 + test2 + test3)/3;
        if (srednia < 60){
            System.out.println("Masz 1");
        } else if (srednia >= 60 && srednia <=69) {
            System.out.println("Masz 2");
        }else if (srednia >= 70 && srednia <=79) {
            System.out.println("Masz 3");
        }else if (srednia >= 80 && srednia <=89) {
            System.out.println("Masz 4");
        }else{
            System.out.println("Masz 5");
        }
    }
}
