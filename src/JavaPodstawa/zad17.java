package JavaPodstawa;

import java.util.Scanner;
public class zad17 {
    public static void main(String[] args) {
        Scanner klawisz = new Scanner(System.in);
        System.out.println("Podaj nazwe ulubionego miasta: ");
        String miasto = klawisz.nextLine();
        System.out.println(miasto.length());
        System.out.println(miasto.toUpperCase());
        System.out.println(miasto.toLowerCase());
        System.out.println(miasto.charAt(0));



    }
}
