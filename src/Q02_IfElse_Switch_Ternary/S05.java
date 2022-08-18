package Q02_IfElse_Switch_Ternary;

import java.util.Scanner;

public class S05 {
    public static void main(String[] args) {
        /*
    Bir aydaki gün sayısını hesaplayan bir Java programı yazınız.

INPUT:

Ay Numarasi:

2

Yil :

2016

OUTPUT  :

Subat 2016 29 Gundur.


         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Yil giriniz");
        int yil=scan.nextInt();
        System.out.println("Ay numarasi giriniz");
        int ayNo=scan.nextInt();

        switch (ayNo){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println(yil+" yili "+ayNo+". ayi 31 gun cekmektedir");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println(yil+" yili "+ayNo+". ayi 30 gun cekmektedir");
                break;
            case 2:
                if (yil%4==0){
                    System.out.println(yil+" yili "+ayNo+". ayi 29 gun cekmektedir");
                }else {
                    System.out.println(yil+" yili "+ayNo+". ayi 28 gun cekmektedir");
                }
                break;
            default:
                System.out.println("Hatali giris yaptiniz tekrar deneyin");


        }




    }
}
