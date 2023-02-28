package ZadaniaIF;
import java.util.Scanner;
public class if17 {
    public static void main(String[] args) {
        Scanner klawisz = new Scanner(System.in);
        System.out.println("Czy któraś z osób jest na diecie wegetariańskiej?: ");
        String slowo1 = klawisz.nextLine().toLowerCase();
        System.out.println("Czy któraś z osób jest na diecie wegańskiej?: ");
        String slowo2 = klawisz.nextLine().toLowerCase();
        System.out.println("Czy któraś z osób jest na diecie bezglutenowej?: ");
        String slowo3 = klawisz.nextLine().toLowerCase();
        System.out.println("Możecie wybrać się do następujących restauracji: ");

        if (slowo1.equals("nie") && slowo2.equals("nie") && slowo3.equals("nie")) {
            System.out.println("Luksusowe burgery u Jarka");
            System.out.println("Włoskie Specjały");
            System.out.println("Pizzeria przy Dworcowej");
            System.out.println("Kawiarnia na Rogu");
            System.out.println("Kuchnia u Szefa");

        } else if (slowo1.equals("nie") && slowo2.equals("nie") && slowo3.equals("tak")) {
            System.out.println("Pizzeria przy Dworcowej");
            System.out.println("Kawiarnia na Rogu");
            System.out.println("Kuchnia u Szefa");

        } else if (slowo1.equals("nie") && slowo2.equals("tak") && slowo3.equals("nie")) {
            System.out.println("Kawiarnia na Rogu");
            System.out.println("Kuchnia u Szefa");

        } else if (slowo1.equals("nie") && slowo2.equals("tak") && slowo3.equals("tak")) {
            System.out.println("Kawiarnia na Rogu");
            System.out.println("Kuchnia u Szefa");

        } else if (slowo1.equals("tak") && slowo2.equals("nie") && slowo3.equals("nie") ){
            System.out.println("Pizzeria przy Dworcowej");
            System.out.println("Kawiarnia na Rogu");
            System.out.println("Włoskie Specjały");
            System.out.println("Kuchnia u Szefa");

        } else if (slowo1.equals("tak") && slowo2.equals("tak") && slowo3.equals("nie")){
            System.out.println("Kawiarnia na Rogu");
            System.out.println("Kuchnia u Szefa");

        } else if (slowo1.equals("tak") && slowo2.equals("nie") && slowo3.equals("tak")) {
            System.out.println("Pizzeria przy Dworcowej");
            System.out.println("Kawiarnia na Rogu");
            System.out.println("Kuchnia u Szefa");
        }else {
            System.out.println("Kawiarnia na Rogu");
            System.out.println("Kuchnia u Szefa");
        }
    }
}
