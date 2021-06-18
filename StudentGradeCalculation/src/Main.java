import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int cMath, cPhysics, cTurkish, cChemistry, cHistory;
        Scanner input = new Scanner(System.in);

        System.out.println("The grade must be between 0 and 100");
        System.out.print("Input Math grade :");
        cMath = input.nextInt();
        System.out.print("Input Physics grade :");
        cPhysics = input.nextInt();
        System.out.print("Input Turkish grade :");
        cTurkish = input.nextInt();
        System.out.print("Input Chemistry grade :");
        cChemistry = input.nextInt();
        System.out.print("Input History grade :");
        cHistory = input.nextInt();

      double  average = (cMath+cChemistry+cHistory+cPhysics+cTurkish)/5;
        System.out.println("average = " + average);
      if (average >= 55)
          System.out.println("You passed class");
      else
          System.out.println("You failed the class");


    }
}