import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input number1 : ");
        int num1 = input.nextInt();
        System.out.print("Input number2 : ");
        int num2 = input.nextInt();

    if(num1 < num2){
        int i = 1;
        while (i <= num1){
            if (i * num2 % num1 == 0) {
                System.out.println("LCM = " + Math.abs(i * num2));
                break;
            }
            i++;
        }
        int k = num1;
        while (k >= 1){
            if (num1 % k == 0 && num2 % k == 0){
                System.out.println("GCD = " + k);
                break;
            }
            k--;
        }
    }else {
        int i = 1;
        while (i <= num2){
            if (i * num1 % num2 == 0) {
                System.out.println("LCM = " + Math.abs(i * num1));
                break;
            }
            i++;
        }
        int k = num2;
        while (k >= 1){
            if (num1 % k == 0 && num2 % k == 0){
                System.out.println("GCD = " + k);
                break;
            }
            k--;
        }

    }

    }
}





