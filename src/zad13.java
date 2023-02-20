import java.util.Scanner;

public class zad13 {

    public static void main(String[] args) {

        final int pudelko = 40;
        final int SERVINGS_PER_BOX = 10;
        final int CALORIES_PER_SERVING = 300;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbę zjedzonych ciasteczek: ");
        int ciastko = scanner.nextInt();

        double servings = (double) ciastko / pudelko * SERVINGS_PER_BOX;
        double calories = servings * CALORIES_PER_SERVING;
        System.out.println("Liczba skonsumowanych kalorii: " + calories);
    }
}
