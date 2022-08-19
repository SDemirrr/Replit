package Q03_For_While;

import java.util.Scanner;

public class S09 {
    public static void main(String[] args) {
        /*
        Kullanıcının girdiği sayıyı tersine çeviren bir java programı yazınız. (Mulakat Sorusu)


Input  :1238

Output :Girilen Numananin Tersi: 8321

         */

        Scanner scan=new Scanner(System.in);
        System.out.println("SAYI GIRINIZ");
        int sayi=scan.nextInt();

        String sayiTrs= String.valueOf((Integer)sayi);

        for (int i = sayiTrs.length(); i >0 ; i--) {
            System.out.print(i);
        }

    }
}
