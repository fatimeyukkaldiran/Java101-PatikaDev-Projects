import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int yil;
        Scanner input = new Scanner(System.in);
        System.out.print("Input a year:");
        yil = input.nextInt();


        boolean artik = false;

        if(yil % 4 == 0)
        {
            if( yil % 100 == 0)
            {
                if ( yil % 400 == 0)
                    artik = true;
                else
                    artik = false;
            }
            else
                artik = true;
        }
        else
            artik = false;

        if(artik)
            System.out.println(yil + " artık yıldır.");
        else
            System.out.println(yil + " artık yıl değildir.");

    /*   if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))){
            System.out.println(year + " "  +"is leap year");
        }else
           System.out.println(year + " "  +"is not leap year");*/

    }
}