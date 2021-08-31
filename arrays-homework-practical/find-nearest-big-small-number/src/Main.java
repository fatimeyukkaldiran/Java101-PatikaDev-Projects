import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sr = new Scanner(System.in);
        System.out.print("Input size of array: ");
        int n = sr.nextInt();
        System.out.print("Input number: ");
        int x = sr.nextInt();

        int arr[] = new int[n];

        for(int i=0;i<n;i++)
        {
            System.out.print("Input array value arr[" + i+ "] : ");
            arr[i] = sr.nextInt();
        }
        int max = arr[0];
        int min = arr[0];


        for (int i = 0; i < arr.length; i++) {

            if (arr[i] < min) {

                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }

        }
        int just_greater = max, just_smaller = min;

        for(int i= 0; i< n; i++)
        {
            //if element is greater than x but smaller than present just_greater
            if(arr[i] > x && arr[i] < just_greater)
                just_greater = arr[i];

            //if element is Smaller than x but smaller than present just_smaller
            if(arr[i] < x && just_smaller < arr[i])
                just_smaller = arr[i];
        }

        if(just_smaller != min)
            System.out.println("nearest smaller number: " +just_smaller);
        else
            System.out.println("No floor of x found");
        if(just_greater != max)
            System.out.println("nearest greater number: " +just_greater);
        else
            System.out.println("No Ceil of x found");
    }

}