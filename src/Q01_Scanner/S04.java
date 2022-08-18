package Q01_Scanner;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class S04 {

    public static void main(String[] args) {
        /*
        Kullanıcıya günde ne kadar çay içtiğini ve ne kadar şeker kullandığını sorun.
         Yılda kaç kg şeker kullandığını hesaplayın ve yazdırın.


1 şeker = 1.7 gr


Örnek Çıktı:

Yılda 12.41 kg şeker kullanıyor.
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Gunde ne kadar cay ictiginizi ve ne kadar seker kullandiginizi giriniz");
        double cayKullanimi=scan.nextDouble();
        double sekerKullanimi=scan.nextDouble()*1.7;


        System.out.println("Yillik seker kullanimi : "+((cayKullanimi*sekerKullanimi*365)/1000)+" kg");





    }
}
