package ZadaniaIF;
import java.util.Scanner;
public class if15 {
    public static void main(String[] args) {
        Scanner klawisz = new Scanner(System.in);
        System.out.println("Wprowadź liczbe czeków wystawionych w danym miesiacu: ");
        int czek = klawisz.nextInt();
        int oplata = 10;

        if (czek < 20){
            double kasa1 = czek * 0.10;
            double suma1 = oplata + kasa1;
            System.out.println("Oplaty pobrane przez bank w danym miesiacu: "+suma1);
        }else if (czek <= 39){
            double kasa2 = czek * 0.08;
            double suma2 = oplata + kasa2;
            System.out.println("Oplaty pobrane przez bank w danym miesiacu: "+suma2);
        } else if (czek <= 59) {
            double kasa3 = czek * 0.06;
            double suma3 = oplata + kasa3;
            System.out.println("Oplaty pobrane przez bank w danym miesiacu: "+suma3);
        } else{
            double kasa4 = czek * 0.04;
            double suma4 = oplata + kasa4;
            System.out.println("Oplaty pobrane przez bank w danym miesiacu: "+suma4);
        }
    }
}
