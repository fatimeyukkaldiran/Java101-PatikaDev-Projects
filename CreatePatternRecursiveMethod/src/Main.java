import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        // Kodluyoruz patika.dev Java patikası Metotlar ödev 3
        // Desene Göre Metot Oluşturma
        //Java dilinde kullanıcıdan alınan n değerine göre aşağıdaki kurala uyan döngü kullanmadan bir "Recursive" metot yazın.

        //Kural : Girilen sayı 0 veya negatif olduğu yere kadar girilen sayıdan 5 rakamını çıkarın.
        //Her çıkarma işlemi sırasında ekrana son değeri yazdırın.
        //Sayı negatif veya 0 olduktan sonra tekrar 5 ekleyin.
        //Yine her ekleme işleminde sayının son değerini ekrana yazdırın.

        Scanner input = new Scanner(System.in);

        System.out.print("Input a number: ");
        int number = input.nextInt();
        createRecursivePattern(number);

    }

    static int createRecursivePattern(int num) {
        System.out.print(num + " ");
        if(num <= 0) {
            return num;
        }
        int temp = createRecursivePattern(num-5)+5;
        System.out.print(temp + " ");
        return temp;
    }
}