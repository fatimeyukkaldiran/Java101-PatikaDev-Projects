import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num1, num2 , num3, temp;
        Scanner input = new Scanner(System.in);

        System.out.println("Input numbers:");
        num1 = input.nextInt();
        num2 = input.nextInt();
        num3 = input.nextInt();

        // Sort numbers from smallest to largest
        if (num1 > num2 && num2 > num3) {
            System.out.println("greatest to smaller:" + " " + num3 +" " + num2 +" " + num1);
        } else  if (num2 > num1 && num2 > num3) {
            if (num3 > num1)
                System.out.println("greatest to smaller:" + " " + num1 +" " + num2 +" " + num3);
            else
                System.out.println("greatest to smaller:" + " " + num3 +" " + num2 +" " + num1);
        }
        else
            System.out.println("greatest to smaller:" + " " + num1 +" " + num2 +" " + num3);

        //  Sort Numbers from Largest to Smallest

    /*    if (num1 > num2 && num2 > num3) {
            System.out.println("greatest to smaller:" + " " + num1 + num2 + num3);
        } else  if (num2 > num1 && num2 > num3) {
            if (num3 > num1)
                System.out.println("greatest to smaller:" + " " + num2 + num3 + num1);
            else
                System.out.println("greatest to smaller:" + " " + num2 + num1 + num3);
        }
        else
            System.out.println("greatest to smaller:" + " " + num3 +" " + num2 +" " + num1);
*/
    }
}
