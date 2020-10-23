package week2.arraylists;

import java.util.ArrayList;

public class BasicArrayLists2 {
    public static void main(String[] args) {
        ArrayList<String> List = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            double d = (Math.random() * ((100) + 1));
            int n = (int) Math.round(d);
            String l = String.valueOf(n);
            List.add(l);
        }

        System.out.println("ArrayList: " + List);
    }
}
