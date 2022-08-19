package Q03_For_While;

import java.util.Scanner;

public class S07 {
    public static void main(String[] args) {
        /*
        Sayinin Mükemmel sayı olup olmadığını kontrol eden Java kodunu yazın.

* Sayının kendisi hariç pozitif bölenlerinin toplamı o sayıya eşitse, herhangi bir sayı Mükemmel Sayı olarak bilinir.
Input :
6
Output:
6 Mukemmel Sayidir.
======================
Input
7
utput:
7 Mukemmel Sayidir degildir.
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("sayi giriniz");
        int sayi=scan.nextInt();
        int toplam=0;

        for (int i = 1; i <sayi ; i++) {

            if (sayi%i==0){
                toplam+=i;
            }



        }

        if (toplam==sayi){
            System.out.println(sayi+" : Mukemmel sayidir");
        }
        else {
            System.out.println(sayi+" : Mukemmel sayi degildir");
        }
    }
}
