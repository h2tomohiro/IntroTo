package week2.arraylists;

import java.util.ArrayList;

public class LocatingTheLargestValue {
    public static void main(String[] args) {
        ArrayList<String> List = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            double d = (Math.random() * ((100) + 1)) + 0;
            int n = (int) Math.round(d);
            String l = String.valueOf(n);
            List.add(l);
        }
        System.out.println("ArrayList: " + List);
        int maxIndex1 = 0;
        int maxIndex2 = 0;
        for (int i = 0; i < List.size(); i++) {
            String str = List.get(i);
            int n = Integer.parseInt(str);
            if (maxIndex1 < n) {
                maxIndex1 = n;
                maxIndex2 = i;
            }
        }

        System.out.println("The largest value is " + maxIndex1 + ", which is in slot " + maxIndex2);
    }
}
