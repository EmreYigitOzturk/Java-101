import java.util.Random;
import java.util.Scanner;

public class Transpoze {
    public static void main(String[] args) {
        Random rnd = new Random();
        Scanner inp = new Scanner(System.in);
        System.out.println("satir sayisini giriniz : ");
        int satir = inp.nextInt();
        System.out.println("sutun sayisini giriniz : ");
        int sutun = inp.nextInt();

        int[][] matris = new int[satir][sutun];

        for (int i = 0; i < matris.length; i++) {
            for (int j = 0; j < matris[i].length; j++) {
                matris[i][j] = rnd.nextInt(10);
            }
        }
        System.out.println("Normal Matris");
        for(int[] str : matris){
            for (int stun : str){
                System.out.print(stun + " ");
            }
            System.out.println();
        }

        int[][] yenimatris = new int[sutun][satir];
        for (int i = 0; i < yenimatris.length; i++) {
            for (int j = 0; j < yenimatris[i].length; j++) {
                yenimatris[i][j] =  matris[j][i];
            }
        }

        System.out.println("Transpoze Matris");
        for (int i = 0; i < yenimatris.length; i++) {
            for (int j = 0; j < yenimatris[i].length; j++) {
                System.out.print(yenimatris[i][j]+" ");
            }
            System.out.println();
        }
    }
}
