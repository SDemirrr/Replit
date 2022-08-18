package Q01_Scanner;

import java.util.Scanner;

public class S03 {
    public static void main(String[] args) {

        /*
        Kullanıcıdan dikdörtgenin kenar uzunluklarını alın ve dikdörtgenin alanını ve
        çevresini konsola yazdıran bir program yazın.

Örnek Çıktı:

Alan: 32

Çevre: 24


         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Dikdortgenin kenar uzunluklarini giriniz");
        double uzunluk=scan.nextDouble(), genislik = scan.nextDouble();


        System.out.println("alan : "+(uzunluk*genislik));
        System.out.println("cevre : "+((uzunluk*2)+(genislik*2)));




    }
}
