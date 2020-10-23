package week2.arrays;

import java.util.Arrays;

public class FindingTheLargestValue {
    public static void main(String[] args) {
        int[] arr = new int[9];

        for (int i = 0; i < arr.length; i++) {
            double a = (Math.random() * ((100) + 1));
            int b = (int) Math.round(a);
            arr[i] = b;
        }
        int maxIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (maxIndex < arr[i]) {
                maxIndex = arr[i];
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("The largest value is " + maxIndex);
    }
}
