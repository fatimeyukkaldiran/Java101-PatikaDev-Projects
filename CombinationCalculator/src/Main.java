import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int n, r, Combination, nFactoriel = 1, rFactoriel = 1, nrFactoriel = 1;
        Scanner input = new Scanner(System.in);

        System.out.print("Input n :");
        n = input.nextInt();
        System.out.print("Input r :");
        r = input.nextInt();
        if (n > r) {
            for (int i = 1; i <= n; i++) {
                nFactoriel *= i;
            }

            for (int j = 1; j <= r; j++) {
                rFactoriel *= j;
            }
            for (int k = 1; k <= (n - r); k++) {
                nrFactoriel *= k;
            }

            System.out.println("nFactoriel = " +nFactoriel );
            System.out.println("rFactoriel = " +rFactoriel);
            System.out.println("n-r factoriel = " + nrFactoriel);

            Combination = nFactoriel/(rFactoriel*(nrFactoriel));
            System.out.println("Combination = " +Combination);
        }else {
            System.out.println("n must be greater than r!!!");
        }

    }

}
