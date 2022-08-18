package Q02_IfElse_Switch_Ternary;

import java.util.Scanner;

public class S02 {

    public static void main(String[] args) {
        /*
        Kullanıcıya Adı, Soyadı ve kredi kartı numaralarını sorarak verilen formata ceviren java kodunu yaziniz.

Input :

John White

1234234534561478

Output : Name :

J*** W****

CCN  : **** **** **** 1478

* Ilk Harfler Buyuk harf ile baslamalidir.

         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Adinizi ve soyadinizi giriniz");
        String adSoyad=scan.nextLine();

        System.out.println("16 haneli kredi kart numaranizi  girinzi");
        String kkNo=scan.nextLine();

      String[] isim=adSoyad.split(" ");
      isim[0]=isim[0].substring(0,1).toUpperCase()+isim[0].substring(1).replaceAll("\\S","*");
      isim[1]=isim[1].substring(0,1).toUpperCase()+isim[1].substring(1).replaceAll("\\S","*");

        System.out.println(isim[0]+" "+isim[1]);

        if (kkNo.length()==19){
            System.out.println(kkNo.substring(0, 15).replaceAll("\\d", "*")
                    + kkNo.substring(15));

        }
        else System.out.println("Hatali giris");





    }
}
