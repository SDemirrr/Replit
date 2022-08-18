package Q01_Scanner;

import java.util.Scanner;

public class S10 {
    public static void main(String[] args) {
        /*
        Kullanıcıdan dakika girmesini isteyin, Dakikaları birkaç yıl ve gün sayısına dönüştürmek için bir Java programı yazın.

INPUT:

Dakika sayısı: 3456789

OUTPUT :

3456789 dakika yaklaşık 6 yıl 210 gündür

         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Dakika giriniz");
        int dk=scan.nextInt();




        System.out.println(dk+ " dakika yaklasik "+(dk/365/24/60)+" yil "+(dk/365/60)+" gundur");
    }
}
