package ZadaniaPetle2;
import java.util.Scanner;

public class petle8 {
    public static void main(String[] args) {
        Scanner klawisz = new Scanner(System.in);
        int liczbaLat;
        do{
            System.out.println("Podaj liczbe lat: ");
            liczbaLat= klawisz.nextInt();
        }while (liczbaLat<1);
        int liczbaMiesiecy = liczbaLat * 12;
        int lacznaliczbaCmO = 0;

        for (int rok = 1; rok<=liczbaLat; rok++) {
            for (int miesiac = 1; miesiac <= 12; miesiac++) {
                int liczbaCmO=0;
                do {
                    System.out.println("Podaj liczbe cm opadów: ");
                    liczbaCmO += klawisz.nextInt();
                } while (liczbaCmO < 0);
                lacznaliczbaCmO += liczbaCmO;
            }
        }
            double sredniPoziomO = (double) lacznaliczbaCmO / liczbaMiesiecy;
            System.out.println("Liczba miesiecy: " + liczbaMiesiecy);
            System.out.println("Łączna liczba cm opadów: " +lacznaliczbaCmO);
            System.out.println("Średni poziom opadów: cm/miesiac\n"+sredniPoziomO);
        }
    }

