import java.util.*;
import java.io.*;

public class Main {
    static  int power(int base, int exp){
        if (exp == 0)
            return 1;

        return base*power(base,(exp-1));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input base: ");
        int base = sc.nextInt();
        System.out.print("Input exp: ");
        int exp = sc.nextInt();
        System.out.println(base + "^" + exp + " = " + power(base,exp));

    }
}