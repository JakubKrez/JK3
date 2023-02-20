
public class zad23 {
    public static void main(String[] args) {
        int akcje = 1000;
        double cenaakcji = 32.87;
        double prowizja = 0.02;
        double kwota = akcje *cenaakcji;
        System.out.println("Kwota zapłacona przez Jacka za akcje: "+kwota);
        double broker = kwota * prowizja;
        System.out.println("Wartość prowizji przy zakupie: "+broker);
        int sakcje = 1000;
        double scenaakcji = 33.92;
        double sprowizja = 0.02;
        double skwota = sakcje * scenaakcji;
        System.out.println("Kwota otrzymana przez Jacka przy sprzedarzy akcji: "+skwota);
        double sbroker = skwota * sprowizja;
        System.out.println("Wartość prowizji przy sprzedarzy: " + sbroker);
        double zyskk = kwota - broker;
        double zysks = skwota - sbroker;
        double zysk = zysks - zyskk;
        if (zysk < 0 ){
            System.out.println("Stracil");
        }else {
            System.out.println("Zyskał: " + zysk);
        }



    }
}
