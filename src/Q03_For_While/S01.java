package Q03_For_While;

import java.util.Scanner;

public class S01 {

    public static void main(String[] args) {
        /*

Kullanıcıdan bir isim ve bir karakter girmesini isteyin, ardından döngüleri kullanarak
 karakterin isimde kaç kez tekrarlandığını kontrol edin.

    char ch1= 'a' ;

		String name =“John came late"

		Expected Output:


    Number of a = 2

         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Isim giriniz");
        String isim=scan.nextLine();
        System.out.println("Aramak istediginiz harfi girinz");
        char harf=scan.next().charAt(0);
        int sayac=0;

        for (int i = 0; i <isim.length() ; i++) {
            if (isim.charAt(i)==harf){
                sayac++;
            }

        }
        System.out.println(harf+" "+isim+"'de "+sayac+" defa kullanilmistir");
    }
}
