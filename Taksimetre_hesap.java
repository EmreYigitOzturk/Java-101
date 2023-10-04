import java.util.Scanner;

public class Taksimetre_hesap {
    public static void main(String[] args) {
        double km,oran = 2.2,fiyat;
        Scanner inp = new Scanner(System.in);
        System.out.println("gidilecek km yi yazınız : ");
        km = inp.nextDouble();

        fiyat = km*oran;
        fiyat +=10;
        System.out.println((fiyat>=20) ? "ücret = "+fiyat : "ücret = 20");

    }
}
