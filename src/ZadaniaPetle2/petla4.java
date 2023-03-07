package ZadaniaPetle2;
import java.util.Scanner;
public class petla4 {
    public static void main(String[] args) {
        Scanner klawisz = new Scanner(System.in);
        System.out.println("Podaj liczbę przepracowanych dni: ");
        int dni = klawisz.nextInt();
        while (dni<1) {
            System.out.println("Nieprawidłowe dane wejściowe, musisz coś poprawić ");
            dni = klawisz.nextInt();
        }
        double zarobas = 1;
        double suma = 0;
        for (int i=1; i <=dni; i++){
            System.out.println(i+" "+zarobas/100 + " zł");
            suma += zarobas;
            zarobas *=2;
        }
        System.out.println("Suma zarobków: "+suma/100 + " zł");


    }
}
