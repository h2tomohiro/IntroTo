package week2.arrays;

import java.util.Scanner;

public class WhereIsIt {
    public static void main(String[] args) {
        int find;
        Scanner in = new Scanner(System.in);
        int arr[] = new int[10];

        for (int i = 0; i < 10; i++) {
            double num = Math.random() * 50;
            int num2 = (int) num;
            arr[i] = num2;
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        System.out.print("Value to find :");
        find = in.nextInt();

        boolean ok = false;
        for (int i = 0; i < 10; i++) {
            if (arr[i] == find) {
                System.out.println(find + " is in slot " + i);
                ok = true;
            }
        }
        if (!ok) {
            System.out.println(find + " is not on the array");
        }
    }
}
