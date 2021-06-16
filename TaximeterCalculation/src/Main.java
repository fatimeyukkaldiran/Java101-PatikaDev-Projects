import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double distance, totalAmount = 10.0, kmPrice = 2.20, minAmount = 20.0;

        Scanner input = new Scanner(System.in);

        System.out.print("Input distance :");
        distance = input.nextDouble();

        totalAmount += distance*kmPrice ;

        totalAmount = (totalAmount > 20.0)?totalAmount:minAmount;

        System.out.println("Total amount = " + totalAmount);

    }
}
