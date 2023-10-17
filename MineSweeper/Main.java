package MineSweeper;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int satir,sutun;
        System.out.println("satir sayisini giriniz : ");
        satir = inp.nextInt();
        System.out.println("sutun sayisini giriniz : ");
        sutun = inp.nextInt();

        MineSweeper mineSweeper = new MineSweeper(satir,sutun);
        mineSweeper.run();
    }
}
