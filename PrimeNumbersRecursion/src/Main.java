import java.util.*;
import java.io.*;

public class Main {
    static  int findPrimeNumber(int num, int i){
        if (num == i)
            return 1;
        if (num%i == 0)
            return 0;
        else
            return  findPrimeNumber(num,i+1);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a number: ");
        int number = sc.nextInt();

        if (findPrimeNumber(number,2) != 0)
            System.out.println(number + " is prime number");
        else
            System.out.println(number + " is not prime number");


    }
}