package ZadaniaIF;
import java.util.Scanner;
public class if7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj trzy imiona:");
        String name1 = input.nextLine();
        String name2 = input.nextLine();
        String name3 = input.nextLine();

        if (name1.compareTo(name2) < 0) {
            if (name2.compareTo(name3) < 0) {

                System.out.println(name1);
                System.out.println(name2);
                System.out.println(name3);
            } else if (name1.compareTo(name3) < 0) {

                System.out.println(name1);
                System.out.println(name3);
                System.out.println(name2);
            } else {

                System.out.println(name3);
                System.out.println(name1);
                System.out.println(name2);
            }
        } else {
            if (name1.compareTo(name3) < 0) {

                System.out.println(name2);
                System.out.println(name1);
                System.out.println(name3);
            } else if (name2.compareTo(name3) < 0) {

                System.out.println(name2);
                System.out.println(name3);
                System.out.println(name1);
            } else {

                System.out.println(name3);
                System.out.println(name2);
                System.out.println(name1);
            }
        }
    }
}

