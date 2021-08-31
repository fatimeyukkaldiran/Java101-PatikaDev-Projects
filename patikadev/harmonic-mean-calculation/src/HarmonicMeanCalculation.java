import java.util.Scanner;

public class HarmonicMeanCalculation {

   public static double calculateHarmonicMean(double arrayList[]){

       int numberOfHarmonicElements = arrayList.length;
       double sumOfHarmonicElements= 0.0;
       for (int i = 0; i < numberOfHarmonicElements; i++) {
           sumOfHarmonicElements += 1.0/arrayList[i];
       }
       return (numberOfHarmonicElements/sumOfHarmonicElements);
   }
}
