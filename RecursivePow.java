import java.util.Scanner;

public class RecursivePow {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int alt,ust;
        System.out.println("Taban Degerini Giriniz : ");
        alt = inp.nextInt();
        System.out.println("Üst Degerini Giriniz : ");
        ust = inp.nextInt();
        System.out.println("Sonuc : "+pow(alt,ust));
    }

    static int pow(int a,int b){
        if(b == 0) {
            return 1;
        }

        else {
            return a * pow(a,b-1);
        }
    }
}
