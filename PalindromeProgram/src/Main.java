import java.util.Scanner;

public class Main {
    static  boolean isPalindrome(int number){
        int temp = number, reverseNumber = 0, digit;

        while (temp != 0){
            digit = temp % 10;
            reverseNumber = (reverseNumber * 10) + digit;
            temp /= 10;
        }
        return number == reverseNumber;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input a number:");
        int number = input.nextInt();

        if (isPalindrome(number))
        System.out.println(number + " is a palindrome number.");
        else
            System.out.println(number + " is not a palindrome number.");

    }

/* with recursive function

    static int reverse = 0 ;
    static int palindromNumber(int num){
        int  mod;
        if (num != 0){
            mod = num % 10;
            reverse = (reverse*10) + mod;
            palindromNumber(num /= 10);

        }
        return  reverse;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a number:");
        int number = sc.nextInt();

        if (number == palindromNumber(number))
            System.out.println(number + " is palindrome");
        else
            System.out.println(number + " is not palindrome");
    } */
}
