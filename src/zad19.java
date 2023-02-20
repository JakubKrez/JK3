public class zad19 {
    public static void main(String[] args) {
        double akcje = 600 * 21.77;
        System.out.println("Cena za same akcje: "+akcje + " zł");
        double prowizja = akcje* 0.02;
        System.out.println("Cena za prowizje: "+prowizja + " zł" );
        double lacznie = akcje + prowizja;
        System.out.println("Łączna kwota: " +lacznie + " zł");
    }
}
