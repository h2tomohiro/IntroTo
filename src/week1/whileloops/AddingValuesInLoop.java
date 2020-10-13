package week1.whileloops;
import java.util.Scanner;

public class AddingValuesInLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("I will add up the numbers you give me.");
        int sum = 0;
        while (true) {
            System.out.print("\nNumber:");
            int number = scanner.nextInt();
            if (number != 0) {
                sum =  sum + number;
                System.out.print("The total so far is " + sum);
            } else if (number == 0) {
                System.out.println("The total is " + sum);
                break;
            }
        }
    }
}
