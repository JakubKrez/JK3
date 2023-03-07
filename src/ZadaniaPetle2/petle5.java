package ZadaniaPetle2;
import java.util.Scanner;
public class petle5 {
    public static void main(String[] args) {
        Scanner klawisz = new Scanner(System.in);
        System.out.println("Wprowadż łańcuch znaków: ");
        String znaki = klawisz.nextLine();
        System.out.println("Wprowadź znak: ");
        char znak = klawisz.nextLine().charAt(0);
        int zlicz = 0;
        for (int i=0; i<znaki.length();i++){
            if (znaki.charAt(i)== znak){
                zlicz++;
            }

        }
        System.out.println("Znak "+znak + " wystąpił: "+zlicz);
    }
}
