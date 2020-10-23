package week2.arraylists;

import java.util.ArrayList;
import java.util.Scanner;

public class FindingValueInArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>(10);
        int find;
        Scanner in = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            double num = Math.random() * 100;
            int num2 = (int) num;
            arr.add(i, num2);
        }
        System.out.println("ArrayList: " + arr);

        System.out.print("Value to find :");
        find = in.nextInt();

        boolean okay = false;
        for (int i = 0; i < 10; i++) {
            if (arr.get(i) == find) {
                System.out.println(find + " is in slot " + i);
                okay = true;
            }
        }
        if (!okay) {
            System.out.println(find + " is not on the array");
        }
    }
}
