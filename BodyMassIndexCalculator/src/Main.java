import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double weight, height, bodyMassIndex;

        Scanner input = new Scanner(System.in);
        System.out.print("Input body weight:");
        weight = input.nextDouble();
        System.out.print("Input body height:");
        height = input.nextDouble();
        bodyMassIndex = weight/(height*height);
        System.out.println("Body mass index = " + bodyMassIndex);

    }
}
