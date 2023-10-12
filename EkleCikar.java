import java.awt.*;
import java.util.Scanner;

public class EkleCikar {
    public static void main(String[] args) {
        int sayi;
        Scanner inp = new Scanner(System.in);
        System.out.println("Sayi Giriniz : ");
        sayi = inp.nextInt();
        sirala(sayi);

    }

    static void sirala(int s){
        if(s == 0){
            System.out.print(s + " ");
            return;
        }
        else if(s<0)
        {
            System.out.print(s + " ");
            return;
        }
        else {
            System.out.print(s+" ");
            sirala(s-5);
        }
        System.out.print(s + " ");
    }
}
