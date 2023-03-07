package ZadaniaPetle2;
import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class petle6 {
    public static void main(String[] args) {
        Scanner klawisz = new Scanner(System.in);
        System.out.println("Wprowadż nazwe pliku: ");
        String znaki = klawisz.nextLine();
        System.out.println("Wprowadź znak: ");
        char znak = klawisz.nextLine().charAt(0);
        File plik = new File(znaki);
        int zlicz = 0;

        try {
            Scanner plikScanne = new Scanner(plik);

            while (plikScanne.hasNextLine()) {
                String linia = plikScanne.nextLine();

                for (int i = 0; i < znaki.length(); i++) {
                    if (znaki.charAt(i) == znak) {
                        zlicz++;
                    }
                }
            }
            System.out.println("Znak " + znak + " wystąpił: " + zlicz);
        } catch (FileNotFoundException e) {
            System.out.println("Nie udało sie otworzyć pliku: " + znaki);
            e.printStackTrace();
        }
    }
}