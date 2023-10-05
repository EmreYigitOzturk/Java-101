import java.util.Scanner;

public class Siralama {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int a,b,c;

        System.out.print("1.sayiyi giriniz : ");
        a = inp.nextInt();

        System.out.print("2.sayiyi giriniz : ");
        b = inp.nextInt();

        System.out.print("3.sayiyi giriniz : ");
        c = inp.nextInt();

        if(a > b && a > c){
            if(b>c){
                System.out.println("a>b>c");
            }
            else{
                System.out.println("a>c>b");
            }
        }

        if(b > a && b > c){
            if(a>c){
                System.out.println("b>a>c");
            }
            else{
                System.out.println("b>c>a");
            }
        }

        if(c > b && c > a){
            if(a>b){
                System.out.println("c>a>b");
            }
            else{
                System.out.println("c>b>a");
            }
        }
    }
}
