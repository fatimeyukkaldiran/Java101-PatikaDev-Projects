import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int num, count = 0, average = 0, numbers = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Input a number:");
        num = input.nextInt();
        for (int i = 0 ; i <= num; i++){
            if( i%3 == 0  && i%4 == 0) {
                count++;
                numbers += i;
                System.out.println(i + ",");
            }
        }
        average = numbers/count;
        System.out.print("average = " + average);
    }
}
