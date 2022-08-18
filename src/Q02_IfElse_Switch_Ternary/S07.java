package Q02_IfElse_Switch_Ternary;

import java.util.Scanner;

public class S07 {

    public static void main(String[] args) {

        /*

        // isim1 çift sayıda karakter içeriyorsa,

        // ikinci kelimeyi ilk adın ortasına yerleştirin

        // ilk kelime tek sayida karakter iceriyorsa

        // “isim1, isim2 ye eklenemiyor” yazdırın

        // Örneğin:
        // isim1= mehmet
        // isim2= ahmet
        // Yazdır ==> mehahmetmet

       // isim1= memet
        // isim2= ahmet
        // Yazdır ==> isim1, isim2 ye eklenemiyor

         */

        Scanner scan=new Scanner(System.in);
        System.out.println("1. ismi giriniz");
        String isim1=scan.next();
        System.out.println("2. ismi giriniz");
        String isim2=scan.next();

        String isim1IlkYarisi=isim1.substring(0,isim1.length()/2);
        String isim1IkinciYarisi=isim1.substring(isim1.length()/2);

        if (isim1.length()%2==0){
            System.out.println(isim1IlkYarisi+isim2+isim1IkinciYarisi);
        }else {
            System.out.println(isim1+" cift karakterli uzunluga sahip olmadigi icin "+isim2+"'in ortasina yerlestiremedik");
        }



    }
}
