import java.util.Scanner;

public class KullaniciGiris {
    public static void main(String[] args) {
        String kullanici,password,istek;
        Scanner inp = new Scanner(System.in);

        System.out.println("Kullanıcı adınızı giriniz : ");
        kullanici = inp.nextLine();
        System.out.println("Şifrenizi giriniz : ");
        password = inp.nextLine();

        if(kullanici.equals("emre") && password.equals("12345"))
        {
            System.out.println("Giriş Başarılı...");
        }
        else if(kullanici.equals("emre")){
            System.out.println("şifre yanliş! Yeniden şifre olusturmak ister misiniz?(y/n)");
            istek = inp.nextLine();
            if(istek.equals("y")){
                System.out.print("yeni şifrenizi giriniz : ");
                password = inp.nextLine();
                System.out.println("yeni şifre başarılı bir şekilde olusturuldu...");
            }
            else{
                System.out.println("yeni şifre olusturulamadı");

            }
        }
        else{
            System.out.println("giris yapılamadı! Kullanıcı adı ve şifre yanlış");
        }
    }
}
