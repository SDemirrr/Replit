package Q01_Scanner;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class S01 {

    public static void main(String[] args) {
        /*
        Kullanıcıdan bir sayı alın ve sayının küpünün yarısını konsola yazdıran bir program yazın.
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        double sayi=scan.nextInt();

        System.out.println(sayi*sayi*sayi/2);
    }
}
