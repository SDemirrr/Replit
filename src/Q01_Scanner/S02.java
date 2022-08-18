package Q01_Scanner;

import java.util.Scanner;

public class S02 {

    public static void main(String[] args) {
        /*
        Kullanıcıdan karenin kenar uzunluğunu alın ve karenin alanını ve çevresini konsola yazdıran bir program yazın.

      Ornek Cikti :

      Alan: 9

      Cevre: 12
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Karenin bir kenar uzunlugunu giriniz");
        double uzunluk=scan.nextDouble();

        System.out.println("Alan : "+(uzunluk*uzunluk));
        System.out.println("Cevre : "+(uzunluk*4));

    }
}
