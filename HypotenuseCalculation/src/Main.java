import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double edge1, edge2, hypotenuse;

        Scanner input = new Scanner(System.in);

        System.out.print("Input edge 1 :");
        edge1 = input.nextDouble();

        System.out.print("Input edge 2 :");
        edge2 = input.nextDouble();

        hypotenuse = Math.sqrt(edge1*edge1 + edge2*edge2);
        System.out.println("Hypotenuse = " + hypotenuse);
    }
}
