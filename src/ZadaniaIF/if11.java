package ZadaniaIF;
import java.util.Scanner;
public class if11 {
    public static void main(String[] args) {
        Scanner klawisz = new Scanner(System.in);

        System.out.println("Podaj 3 nazwiska biegaczy: ");
        String name1 = klawisz.nextLine();
        String name2 = klawisz.nextLine();
        String name3 = klawisz.nextLine();
        System.out.println("Podaj czas ukończeniu biegu 3 biegaczy(w minutach): ");
        double czas1 = klawisz.nextDouble();
        double czas2 = klawisz.nextDouble();
        double czas3 = klawisz.nextDouble();

        if (czas1< czas2 && czas1 < czas3 && czas2<czas3){
            System.out.println("1."+name1);
            System.out.println("2."+name2);
            System.out.println("3."+name3);
        } else if (czas1 < czas2 && czas1 < czas3 && czas3<czas2) {
            System.out.println("1." +name1);
            System.out.println("2." +name3);
            System.out.println("3." +name2);
        } else if (czas2 < czas1 && czas2 < czas3 && czas1 < czas3){
            System.out.println("1."+name2);
            System.out.println("2."+name1);
            System.out.println("3."+name3);
        } else if (czas2 < czas1 && czas2 < czas3 && czas3 < czas1) {
            System.out.println("1."+name2);
            System.out.println("2."+name3);
            System.out.println("3."+name1);
        }else if (czas3<czas1 && czas3<czas2 && czas1<czas2){
            System.out.println("1."+name3);
            System.out.println("2."+name1);
            System.out.println("3."+name2);
        }else {
            System.out.println("1."+name3);
            System.out.println("3."+name2);
            System.out.println("2."+name1);
        }
    }
}
