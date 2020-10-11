package basics;

import java.util.Arrays;

public class ArraysExample {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};

        System.out.println(arr1.length);

        System.out.println(arr1[0]);
        System.out.println(arr1[arr1.length - 1]);

        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }

        arr1[0] = 7;

        for (int elem: arr1) {
            System.out.println(elem);
        }

        System.out.println(arr1);
        System.out.println(Arrays.toString(arr1));

        //2. create an array with "size"
        int[] arr2 = new int[10];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = i + 1;
        }
        System.out.println(Arrays.toString(arr2));

        int[] arr3 = new int[] {1,2};
        String[] contries = {"Canada", "Japan", "Brazil", "Spain", "Germany", "Korea"};
        for (String contry : contries) {
            System.out.println(contry);
        }
    }
}
