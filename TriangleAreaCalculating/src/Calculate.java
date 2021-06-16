import java.util.Scanner;

public class Calculate {
    public static void main(String[] args) {

        double edge1, edge2, edge3, u, perimeter ;

        Scanner input = new Scanner(System.in);

        System.out.print("Input edge 1 :");
        edge1 = input.nextDouble();
        System.out.print("Input edge 2 :");
        edge2 = input.nextDouble();
        System.out.print("Input edge 3 :");
        edge3 = input.nextDouble();

        perimeter = edge1+edge2+edge3;
        u = perimeter/2;
        double area = Math.sqrt(u * (u - edge1) * (u - edge2) * (u - edge3));

        System.out.println("Triangle perimeter = " + perimeter);
        System.out.println("Triangle area = " + area);



    }
}
