import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

        double sumOfArray = 0.0;
        System.out.print("Determine array size:");
        int sizeOfArray = input.nextInt();
        double [] arrayList = new double[sizeOfArray];


        for (int i = 0; i < arrayList.length; i++) {
            System.out.print("input array value " + "arrayList[" + i +"] =");

            arrayList[i] = input.nextInt();
        }

      double averageOfHarmonicInArray =  HarmonicMeanCalculation.calculateHarmonicMean(arrayList);
        System.out.println("average of harmonic in array = " + averageOfHarmonicInArray);





    }
}
