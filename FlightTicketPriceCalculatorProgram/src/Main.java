import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int distance, age , tripType;

        double totalPriceFlight,normalPrice, discountedPrice,ageDiscountedPrice = 0,roundTripDiscountedPrice,ageDiscountRate, kmPrice = 0.10;

        Scanner input = new Scanner(System.in);

        System.out.print("Input distance by km :");
        distance = input.nextInt();
        System.out.print("Input age :");
        age = input.nextInt();
        System.out.println("Input age rate: \n if age < 12 rate:0.5 \n 12 <= age <= 24 rate:0.10 \n age > 65 rate:0.30 \n if none rate: 0");
        ageDiscountRate = input.nextDouble();
        System.out.println("Input trip type, 1: one way, 2:road-trip:");
        tripType = input.nextInt();

        normalPrice = distance*kmPrice;
        ageDiscountedPrice = normalPrice*ageDiscountRate;
        discountedPrice = normalPrice - ageDiscountedPrice;
        roundTripDiscountedPrice = discountedPrice * 0.20;
        totalPriceFlight = (discountedPrice - roundTripDiscountedPrice) * 2;

        if (distance > 0 && age > 0 && tripType == 1 || tripType == 2){
           if (age < 12){
               if (tripType == 2) {
                   System.out.println("Total price = " + totalPriceFlight);
                } else
                   System.out.println("Total price = " + discountedPrice);

            } else if ( age >= 12 && age <= 24){
               if (tripType == 2) {
                   System.out.println("Total price = " + totalPriceFlight);
               } else
                   System.out.println("Total price = " + discountedPrice);
            }else  if (age > 65){
               if (tripType == 2) {
                   System.out.println("Total price = " + totalPriceFlight);
               } else
                   System.out.println("Total price = " + discountedPrice);
            }else{
               if (tripType == 2) {
                   System.out.println("Total price = " + totalPriceFlight);
               } else
                   System.out.println("Total price = " + discountedPrice);
           }

        }else
            System.out.println("Wrong input!!");

    }
}

