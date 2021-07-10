import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double r,area,area2,circumference , PI = 3.14;
        int alpha;
        Scanner input = new Scanner(System.in);

        System.out.print("Input circle radius :" );
        r = input.nextDouble();

        area = PI*r*r;
        circumference = 2*PI*r;

        System.out.println("circle area = " + area);
        System.out.println("circle circumference = " + circumference);

        System.out.println("********************************************************");

        System.out.print("Input center angle:");
        alpha = input.nextInt();

        area2 = (PI*(r*r)*alpha)/360;
        System.out.println("Circle area with angle = " + area2);
    }
}
