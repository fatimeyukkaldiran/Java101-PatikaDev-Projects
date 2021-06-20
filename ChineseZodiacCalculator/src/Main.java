import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int bYear, result;
        String zodiac = null;
        Scanner input = new Scanner(System.in);
        System.out.print("Input birth year :");
        bYear = input.nextInt();

        result = bYear % 12;

        switch (result){
            case 0:
                zodiac = "Monkey";
                break;

            case 1:
                zodiac = "Rooster";
                break;
            case 2:
                zodiac = "Dog";
                break;
            case 3:
                zodiac = "Pig";
            case  4:
                zodiac = "Rat";
                break;
            case 5:
                zodiac = "Ox";
                break;
            case 6:
                zodiac = "Tiger";
                break;
            case 7:
                zodiac = "Rabbit";
                break;
            case  8:
                zodiac = "Dragon";
                break;
            case 9:
                zodiac = "Snake";
                break;
            case 10:
                zodiac = "Horse";
                break;
            case 11:
                zodiac = "Goat";
                break;

            default:
                System.out.println("Invalid input!!");
                break;

        }
        System.out.println("your zodiac animal : " +zodiac);
    }
}
