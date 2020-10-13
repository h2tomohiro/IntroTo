package week1.forloops;

import java.util.Scanner;

public class CountingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Count to:");
        int age = scanner.nextInt();
        for(int i = 0; i <= age; i++)
        System.out.print(i+" ");
    }
}
