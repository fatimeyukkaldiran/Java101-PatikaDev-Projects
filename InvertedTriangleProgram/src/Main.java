import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input number of digits : ");
        int n = input.nextInt();

        for (int i = (n - 1); i >= 0; i--) {
            for (int j = (n - i); j > 0; j--) {
                System.out.print(" ");
            }

            for (int k = 1; k <= (2 * i + 1); k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
     /*   int temp = n;
        for (int i = 0; i < n; i++){
            for ( int j = 1; j <= (i+1 ); j++) {
                System.out.print(" ");
            }
            for (int s = 1 ; s <= (temp*2 -1 ); s++){
                System.out.print("*");
            }
            System.out.println(" ");
            temp --;
        } */

    }
}
