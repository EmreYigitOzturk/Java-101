import java.util.Scanner;

public class OrtHesap {
    public static void main(String[] args) {
        int mat,fizik,kimya,turkce,tarih,muzik;
        Scanner input = new Scanner(System.in);

        System.out.println("matematik notunuzu giriniz : ");
        mat = input.nextInt();
        System.out.println("fizik notunuzu giriniz : ");
        fizik = input.nextInt();
        System.out.println("kimya notunuzu giriniz : ");
        kimya = input.nextInt();
        System.out.println("turkce notunuzu giriniz : ");
        turkce = input.nextInt();
        System.out.println("tarih notunuzu giriniz : ");
        tarih = input.nextInt();
        System.out.println("muzik notunuzu giriniz : ");
        muzik = input.nextInt();

        double sonuc = (mat+fizik+kimya+turkce+tarih+muzik)/6;
        System.out.println("Ortalamanız : "+sonuc);
        System.out.println((sonuc>=60) ? "Sınıfı Geçti": "Sınıfta Kaldı");


    }
}
