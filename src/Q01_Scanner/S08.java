package Q01_Scanner;

import java.util.Scanner;

public class S08 {

    public static void main(String[] args) {
        /*
        Kullanıcıdan üç basamaklı bir sayı girmesini ve bu sayının basamaklarının toplamını bulmasını isteyin.

         Örnek Çıktı:

         Verilen tamsayının rakamları toplamı 10'dur.
         */

       Scanner scan=new Scanner(System.in);
        System.out.println("uc basamakli bir sayi giriniz");
        int sayi=scan.nextInt();
        int basamaklarTop=0;
        int temp=sayi;


        basamaklarTop+=temp%10;
        temp=temp/10;
        basamaklarTop+=temp%10;
        temp=temp/10;
        basamaklarTop+=temp%10;


        System.out.println(sayi+"'in basamaklar toplami : "+basamaklarTop);


    }
}
