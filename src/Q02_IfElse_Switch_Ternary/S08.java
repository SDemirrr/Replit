package Q02_IfElse_Switch_Ternary;

import java.util.Scanner;

public class S08 {

    public static void main(String[] args) {
        /*
        Kullanıcıdan bir isim girmesini isteyin ve son 2 harfinin 3 kopyasından oluşan yeni bir String yazdırın

Kullanicidan alinan isim uzunluğu en az 2 olacaktır.

INPUT   : Mustafa

OUTPUT  : fafafa
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Isim giriniz");
        String isim=scan.nextLine();

        if (isim.length()>=2){
            for (int i = 1; i <=3 ; i++) {
                System.out.print(isim.substring((isim.length() - 2)));
            }
        }
    }
}
