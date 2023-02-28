package ZadaniaPetle;
import java.util.Scanner;

public class petla2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String odpowiedz;

        while (true) {
            System.out.print("Podaj litere: ");
            odpowiedz = scanner.nextLine();

            if (odpowiedz.equalsIgnoreCase("T")) {
                System.out.println("Prawidłowo!");
                break;
            } else if (odpowiedz.equalsIgnoreCase("N")) {
                System.out.println("Prawidłowo!");
                break;
            } else {
                System.out.println("Nieprawidłowa odpowiedź.");
            }
        }
    }
}