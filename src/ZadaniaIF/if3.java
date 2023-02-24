package ZadaniaIF;
import java.util.Scanner;

public class if3 {
    public static void main(String[] args) {
        Scanner klawisz = new Scanner(System.in);
        System.out.println("Podaj swoją wagę w kg: ");
        double waga = klawisz.nextDouble();
        System.out.println("Podaj swoj wzrost w metrach: ");
        double wzrost = klawisz.nextDouble();

        double bmi = waga/(wzrost*wzrost);
        if (bmi < 18.5){
            System.out.println("Masz niedowage");
        } else if (bmi >= 18.5 && bmi <=25) {
            System.out.println("Jestes git");
        }else  {
            System.out.println("Masz nadwage");
        }
    }
}
