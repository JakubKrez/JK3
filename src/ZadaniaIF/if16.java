package ZadaniaIF;
import java.util.Scanner;
public class if16 {
    public static void main(String[] args) {
        Scanner klawisz = new Scanner(System.in);
        System.out.println("Podaj liczbe książek zakupionych w danym miesiacu: ");
        int ksiega = klawisz.nextInt();
        if (ksiega == 0){
            int zakup1 = 0;
            System.out.println("Przyznane punkty za zakup ksiązek: "+zakup1);
        }else if (ksiega == 1){
            int zakup2 = 5;
            System.out.println("Przyznane punkty za zakup ksiązek: "+zakup2);
        } else if (ksiega == 2) {
            int zakup3 = 15;
            System.out.println("Przyznane punkty za zakup ksiązek: "+zakup3);
        } else if (ksiega == 3){
            int zakup4 = 30;
            System.out.println("Przyznane punkty za zakup ksiązek: "+zakup4);
        }else {
            int zakup5 = 60;
            System.out.println("Przyznane punkty za zakup ksiązek: "+zakup5);
        }
    }
}
