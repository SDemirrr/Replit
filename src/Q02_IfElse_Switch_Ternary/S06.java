package Q02_IfElse_Switch_Ternary;

import java.util.Scanner;

public class S06 {

    public static void main(String[] args) {

        /*
        Kullanıcıdan bir isim yazmasını isteyin, adın uzunluğu 3 olmalıdır.
Ardından, adın aynı karakterlere sahip olup olmadığını kontrol edin.

Eger aynı karakterlere sahipse

"isim ayni karakterlere sahiptir." yazdirin.

Eger ayni kaakterlere sahip degilse

"uniqe" yazdirin.

Ternary kullanin.


         */

        Scanner scan=new Scanner(System.in);
        System.out.println("isim giriniz");
        String isim=scan.nextLine();

        System.out.println((isim.length()==3)?
                ((isim.charAt(0)!=isim.charAt(1)&&isim.charAt(0)!=isim.charAt(2)&&isim.charAt(1)!=isim.charAt(2))
                ?"uniqe":"isim ayni karakterlere sahiptir."):"isim 3 karakterli degildir");


    }

}
