import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double kApple,kBanana,kTomato,kPear,kEggplant, totalAmount;

        Scanner input = new Scanner(System.in);

        System.out.print("How many kilograms a pear:");
        kPear = input.nextDouble();
        System.out.print("How many kilograms a apple:");
        kApple = input.nextDouble();
        System.out.print("How many kilograms a banana:");
        kBanana = input.nextDouble();
        System.out.print("How many kilograms a tomato:");
        kTomato = input.nextDouble();
        System.out.print("How many kilograms a eggplant:");
        kEggplant = input.nextDouble();

        totalAmount = (kApple*3.67 + kPear*2.14 + kTomato*1.11 + kBanana*0.95 + kEggplant*5.00);
        System.out.print("Total amounts = " + totalAmount);

    }

}
