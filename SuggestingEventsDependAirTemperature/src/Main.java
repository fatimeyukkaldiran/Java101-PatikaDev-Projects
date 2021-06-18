import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int heat;
        Scanner input = new Scanner(System.in);

        System.out.print("Input heat value :");
        heat = input.nextInt();

        if (heat <= 5) {
            System.out.println("You can go skiing");
        }else if (heat <= 25) {
            if (heat <= 15)
            System.out.println("You can go to cinema");
            if (heat >= 10)
                System.out.println("You can go to picnic");
        }else
            System.out.println("You can go swimming");
    }
}
