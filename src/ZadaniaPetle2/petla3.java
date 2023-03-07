package ZadaniaPetle2;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class petla3 {
    public static void main(String[] args)throws FileNotFoundException {
        Scanner klawisz = new Scanner(System.in);
        System.out.println("Podaj szybkość pojazdu(km/h): ");
        int szybkosc = klawisz.nextInt();
        System.out.println("Podaj liczbe godzin podróży: ");
        int godziny = klawisz.nextInt();
        PrintWriter zapis = new PrintWriter("zad3.txt");
        if (szybkosc<0 || godziny<1){
            System.out.println("Popraw dane wejściowe!!! ");
        }else{

            for (int i=1; i<=godziny; i++){
                int odleglosc = szybkosc * i;
                zapis.println(i+ " aaaaaaabbbbbbbbccccccsdasd"+odleglosc);
            }
            zapis.close();
        }


    }
}