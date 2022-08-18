package Q01_Scanner;

import java.util.Scanner;

public class S09 {

    public static void main(String[] args) {

        /*
        Girilen zamanı saniyeye çeviren bir program yazınız.


Örnek Çıktı:

1 saat 10 dakika 50 saniye ==>

4250 saniye
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("saniyeye donusturmek istediginiz zamani  giriniz");
        System.out.println("Saat girinzi");
        int saat= scan.nextInt();
        System.out.println("dakika giriniz");
        int dk=  scan.nextInt();


        System.out.println(saat+" saat "+dk+" dakika ==> "+(saat*60*60)+" saniye");


    }
}
