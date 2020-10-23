package week2.arrays;

import java.util.Arrays;

public class LocatingTheLargestValue {
    public static void main(String[] args) {
        int[] arr = new int[9];
        for (int i = 0; i < arr.length; i++) {
            double a = (Math.random() * ((100) + 1));
            int b = (int) Math.round(a);
            arr[i] = b;
        }
        int maxIndex1 = 0;
        int slot = 0;
        for (int i = 0; i < arr.length; i++) {
            if (maxIndex1 < arr[i]) {
                maxIndex1 = arr[i];
                slot = i;
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("The largest value is " + maxIndex1);
        System.out.println("And it is in slot " + slot);
    }
}
