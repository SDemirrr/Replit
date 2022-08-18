package Q02_IfElse_Switch_Ternary;

import java.util.Scanner;

public class S03 {
    public static void main(String[] args) {
        /*
        Verilen iki sayının (sıfırdan büyük veya sıfıra eşit) toplamını hesaplayan ve yazdıran bir Java programı yazın.
Verilen tamsayılar veya toplam 10'dan fazla basamakli olursa, "OverFlow" yazdırın.

Ornek:

INPUT      :

25

46

OUTPUT :

Numaralarin Toplami:

71

         */

        Scanner scan=new Scanner(System.in);
        System.out.println("iki sayi giriniz");
        int sayi1=scan.nextInt(),sayi2=scan.nextInt();
        String uzunluk= String.valueOf(Integer.valueOf(sayi1+sayi2));



        if (uzunluk.length()<10){
            System.out.println(sayi1+sayi2);
        }
        else System.out.println( "OverFlow");

    }
}
