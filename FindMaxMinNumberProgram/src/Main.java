import java.util.Scanner;
import  java.lang.Math;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int max = 0, min = 0, temp = 0;
        System.out.print("number of input : ");
        int num = input.nextInt();

        for (int i = 1; i <= num; i++){
            System.out.print("Input number" + i + ":");
            int n = input.nextInt();

            if (n > temp){
                max = n;
            }else
                min = n;

            temp = n;
        }
        System.out.println("Max number : " + max);
        System.out.println("Min number : " + min);
    }
}