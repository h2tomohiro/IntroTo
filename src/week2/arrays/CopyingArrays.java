package week2.arrays;

import java.util.Arrays;

public class CopyingArrays {
    public static void main(String[] args) {

        int[] arr1 = new int[9];
        int[] arr2 = new int[arr1.length];

        for (int i = 0; i < arr1.length; i++) {
            double d = (Math.random() * ((100) + 1));
            int n = (int) Math.round(d);
            arr1[i] = n;
        }
        for (int i = 0; i < arr1.length; i++) {
            arr2[i] = arr1[i];
        }

        arr1[arr1.length - 1] = -7;

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
    }
}
