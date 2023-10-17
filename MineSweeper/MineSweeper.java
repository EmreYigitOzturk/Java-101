package MineSweeper;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MineSweeper {


    int satir,sutun;
    MineSweeper(int satir,int sutun){
        this.satir = satir;
        this.sutun = sutun;

    }

    void run(){

        String[][] harita = makeDemo();
        printHarita(harita);
        int count = 0;
        int secsatir,secsutun;
        Scanner inp = new Scanner(System.in);
        while(true){

            if(winCheck(harita) == true){
                System.out.println("---------Oyunu Kazandınız!--------");
                break;
            }


            System.out.println("satir seciniz : ");
            secsatir = inp.nextInt();
            System.out.println("sutun seciniz : ");
            secsutun = inp.nextInt();
            if(harita[secsatir][secsutun] == "*")
            {
                System.out.println("----------Game Over----------");
                break;
            }

            count = 0;
            for (int i = secsatir - 1; i <= secsatir + 1; i++) {
                for (int j = secsutun - 1; j <= secsutun + 1; j++) {
                    if (i >= 0 && i < satir && j >= 0 && j < sutun && harita[i][j].equals("*")) {
                        count++;
                    }
                }
            }
            String str = Integer.toString(count);
            harita[secsatir][secsutun] = str;

            printHarita(harita);

        }



    }

    boolean winCheck(String[][] harita){
        for (int i = 0; i < harita.length; i++) {
            for (int j = 0; j < harita[i].length; j++) {
                if(harita[i][j] == "-")
                {
                    return false;
                }
            }
        }
        return true;
    }

    void printHarita(String[][] harita){
        System.out.println("----------harita------------");
        for (int i = 0; i < harita.length; i++) {
            for (int j = 0; j < harita[i].length; j++) {
                System.out.print(harita[i][j]+ " ");
            }
            System.out.println();
        }
    }

    String[][] makeDemo(){
        Random rand = new Random();
        int mayinSayisi = (satir*sutun)/4;
        String[][] harita = new String[satir][sutun];
        for (int i = 0; i < harita.length; i++) {
            for (int j = 0; j < harita[i].length; j++) {
                harita[i][j] = "-";
            }
        }

        for (int i = 0; i < mayinSayisi; i++) {
            int mayinsatir = rand.nextInt(satir-1);
            int mayinsutun = rand.nextInt(sutun-1);
            harita[mayinsatir][mayinsutun] = "*";
        }
        return harita;
    }

}
