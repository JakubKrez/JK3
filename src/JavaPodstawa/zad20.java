package JavaPodstawa;

public class zad20 {
    public static void main(String[] args) {
        System.out.println("Liczba ankietowanych osób ogólnie: 12467");
        double energetyk = 12467 * 0.14;
        System.out.printf("Liczba ankietowanych osób kupująca przynajmniej jeden napój energetczyny tygodniowo: %.0f\n",energetyk);
        double cytrus = energetyk * 0.64;
        System.out.printf("Liczba ankietowanych osób które preferują napój o smaku cytrusowym: %.0f\n",cytrus);



    }
}
