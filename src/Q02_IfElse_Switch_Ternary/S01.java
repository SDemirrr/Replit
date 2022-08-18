package Q02_IfElse_Switch_Ternary;

import java.util.Scanner;

public class S01 {
    public static void main(String[] args) {

        /*
        Kullanıcıya kilosunu ve boyunu sorun ve kitle indeksini hesaplayan bir program yazın (BMI)

IPUCU : BMI = Agirlik(kg) / Boy*Boy (m)


BMI 18,5'in altındaysa zayıfsınız

BMI 18,5 ile 25 arasında ise kilonuz idealdir

BMI 25-30 arasındaysa şişmansınız

BMI 30'dan büyük veya eşitse, obez


Input:

Output:

Agirlik : 71

Boy : 1,72

BMI : 23.99945916711736

Zayifsiniz.
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Kilonuzu giriniz");
        double kilo=scan.nextDouble();
        System.out.println("Boyunuzu giriniz");
        double boy=scan.nextDouble();

        double bmi=kilo/(boy*boy);

        if (bmi<18.5){
            System.out.println("Zayifsiniz");
        } else if (bmi<=25) {
            System.out.println("Ideal kilonuzdasiniz");

        } else if (bmi<30) {
            System.out.println("sismansiniz");

        } else {
            System.out.println("obezsiniz");

        }

    }
}
