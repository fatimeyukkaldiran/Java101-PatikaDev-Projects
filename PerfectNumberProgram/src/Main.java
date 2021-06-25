import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = 1, sum = 0;
        System.out.print("Input a number: ");
        int num = input.nextInt();
        while (count < num){
            if (num % count == 0){
                sum += count;
            }
            count++;
        }
        if (sum == num)
            System.out.println(num + " is perfect number.");
        else
            System.out.println(num + " is not perfect number.");

    }
}