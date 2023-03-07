package ZadaniaPetle2;
import java.util.Scanner;
public class petla2 {
    public static void main(String[] args) {
        Scanner klawisz = new Scanner(System.in);
        System.out.println("Podaj szybkość pojazdu(km/h): ");
        int szybkosc = klawisz.nextInt();
        System.out.println("Podaj liczbe godzin podróży: ");
       int godziny = klawisz.nextInt();
       if (szybkosc<0 || godziny<1){
           System.out.println("Popraw dane wejściowe!!! ");
       }else{

        for (int i=1; i<=godziny; i++){
            int odleglosc = szybkosc * i;
            System.out.println(i+ " "+odleglosc);
        }
       }


    }
}
