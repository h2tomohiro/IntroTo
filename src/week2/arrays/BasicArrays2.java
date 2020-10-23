package week2.arrays;

public class BasicArrays2 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            double d = (Math.random() * ((100) + 1));
            int n = (int) Math.round(d);
            arr[i] = n;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Slot " + i + " contains a " + arr[i]);
        }
    }

}
