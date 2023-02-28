package ZadaniaIF;
import java.util.Scanner;
public class if12 {
    public static void main(String[] args) {
        Scanner klawisz = new Scanner(System.in);
        System.out.println("Wprowadź słowo: powietrze / woda / stal");
        String slowo = klawisz.nextLine().toLowerCase();
        System.out.println("Wprowadź odleglosc jaka ma przebyc w danym nosniku: ");
        double odleglosc = klawisz.nextDouble();

        switch (slowo) {
            case "powietrze" -> {
                double czasp = odleglosc / 343;
                System.out.println("Czas potrzebny do pokonania przez dzwiek odleglosci: " + czasp);
            }
            case "woda" -> {
                double czasw = odleglosc / 1490;
                System.out.println("Czas potrzebny do pokonania przez dzwiek odleglosci: " + czasw);
            }
            case "stal" -> {
                double czass = odleglosc / 5100;
                System.out.println("Czas potrzebny do pokonania przez dzwiek odleglosci: " + czass);
            }
        }





    }
}
