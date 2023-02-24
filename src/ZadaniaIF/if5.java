package ZadaniaIF;
import java.util.Scanner;
public class if5 {
    public static void main(String[] args) {
        Scanner klawisz = new Scanner(System.in);
        System.out.println("Podaj mase obiektu: ");
        double masa = klawisz.nextDouble();
        double ciezar = masa * 9.8;
        if (ciezar <10){
            System.out.println("Obiekt jest zbyt lekki");
        } else if (ciezar > 1000) {
            System.out.println("Obiekt jest zbyt cieżki");
        }else {
            System.out.println("Obiekt waży: " + ciezar + " Niutonów");
        }
    }
}
