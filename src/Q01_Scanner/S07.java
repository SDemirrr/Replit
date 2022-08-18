package Q01_Scanner;

import java.util.Scanner;

public class S07 {

    public static void main(String[] args) {

        /*
        Kullanıcıdan bir Float değer girmesini isteyin,
         bu sayıyı short değişken tipine dönüştürün ve konsolda yazdırın.
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("ondalikli bir sayi giriniz");
        float sayi=scan.nextFloat();

        System.out.println("Donusturulmus hali : "+((short)sayi));
    }
}
