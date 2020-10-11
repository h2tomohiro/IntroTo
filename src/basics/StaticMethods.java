package basics;

import java.util.Arrays;

public class StaticMethods {
    public static void main(String[] args) {
        System.out.println(addTwo(10, 20));
        int a = 10;
        int b = 20;
        System.out.printf("a = %d, b = %d\n", a,b);
        swap(a,b);
        System.out.printf("a = %d, b = %d\n", a,b);

        int[] arr = {1,2,3};
        System.out.println(Arrays.toString(arr));
        changeFirstElment(arr);
        System.out.println(Arrays.toString(arr));

        // copying an array
        int[] arr1 = arr.clone();
        System.out.println(Arrays.toString(arr1));
        int[] arr2 = Arrays.copyOf(arr, arr.length);
        System.out.println(Arrays.toString(arr2));

        System.out.println(arr == arr1);
        System.out.println(arr == arr2);
        System.out.println(Arrays.equals(arr, arr1));
    }

    // pass by reference
    public static void changeFirstElment(int[] array) {
        array[0] = 7;
    }

    // pass by value
    public static int swap(int x, int y) {
        int temp = x;
        x = y;
        y = temp;
        return x + y;
    }

    public static int addTwo(int a, int b) {
        return a + b;
    }
}
