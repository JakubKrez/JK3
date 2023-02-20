import java.util.Scanner;
public class zad21 {

    public static void main(String[] args) {
        Scanner klawisz = new Scanner(System.in);
        double cukier = 1.5;
        double maslo = 1;
        double maka = 2.75;
        double ciastkoc = cukier/48;
        double ciastkom = maslo/48;
        double ciastkoa = maka/48;
        System.out.println("Wprowadz oczekiwana liczbe ciastek: ");
        int ciacho = klawisz.nextInt();
        double ciachocukf = ciacho * ciastkoc;
        double ciachomaf = ciacho * ciastkom;
        double ciachomsf = ciacho * ciastkoa;
        System.out.println("Potrzeba: \n"+ ciachocukf+" szklanek cukru\n"+ciachomaf+" szklanek masla\n"+ciachomsf+" szklanek mąki\n");


    }
}
