package basics;

import java.util.Scanner;

public class IOExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter teh language code: ");
        String countryCode = in.nextLine();
        switch (countryCode) {
            case "en":
                System.out.println("I Love You");
                break;
            case "pt-br":
                System.out.println("Eu Amo Voce");
                break;
            case "es":
                System.out.println("Te Amo");
                break;
            case "jp":
                System.out.println("aishiteru");
                break;
            case "kr":
                System.out.println("Saranghae");
                break;
            case "q":
                System.exit(0);//terminate the program
            default:
                System.out.println("Country Code Not Supported!");
                break;
        }
    }
}

//        System.out.println(input);

//        String jp = "";
//        if (age > 50) {
//            System.out.println("Age is greater than 50");
//        } else if (age > 30 && age <= 50) {
//            System.out.println("30 < Age <= 50");
//        } else {
//            System.out.println("Age <= 30");
//        }

//        System.out.println("Enter your name: ");
//        String input = in.nextLine();
//        System.out.println(input);
