import java.util.*;
import java.io.*;

public class Main {
    static int fibo(int n) {
        if (n <= 1) {
            return n;
        }
        return fibo(n - 1) + fibo(n - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input iteration number: ");
        int N = sc.nextInt();
        for (int i = 0; i < N+2; i++){
            System.out.print(fibo(i) + " ");
        }

    }
}