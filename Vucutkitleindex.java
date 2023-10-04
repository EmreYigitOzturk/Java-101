import java.util.Scanner;

public class Vucutkitleindex {
    public static void main(String[] args) {
        double boy,kilo,index;
        Scanner inp = new Scanner(System.in);

        System.out.print("Lutfen Boyunuzu giriniz : ");
        boy = inp.nextDouble();
        System.out.print("Lutfen Kilonuzu Giriniz : ");
        kilo = inp.nextDouble();
        index = kilo / (boy*boy);
        System.out.println("Vücut Kitle İndexiniz : "+index);
    }
}
