import java.util.Scanner;

public class kdvhesap {
    public static void main(String[] args) {
        double fiyat, kdvoran=0.18;
        Scanner inp = new Scanner(System.in);
        System.out.println("Lutfen fiyatı giriniz : ");
        fiyat = inp.nextDouble();
        System.out.println("KDV'siz Fiyat : "+fiyat);
        System.out.println("KDV'li Fiyat : "+ (fiyat*kdvoran+fiyat));
        System.out.println("KDV Tutarı : "+fiyat*kdvoran);


    }
}
