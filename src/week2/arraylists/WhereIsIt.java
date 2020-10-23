package week2.arraylists;

import java.util.ArrayList;
import java.util.Scanner;

public class WhereIsIt {
    public static void main(String[] args) {
        ArrayList<String> List = new ArrayList<String>();
        for (int i = 0; i <= 9; i++) {
            double d = (Math.random() * ((100) + 1));
            int n = (int) Math.round(d);
            String l = String.valueOf(n);
            List.add(l);
        }

        System.out.println("ArrayList: " + List);
        System.out.println("Value to find: ");

        Scanner userIn = new Scanner(System.in);

        int userInput = userIn.nextInt();
        int index = -1;

        for (int i = 0; i < List.size(); i++) {
            String str = List.get(i);
            int n = Integer.parseInt(str);
            if (n == userInput) {
                index = i;
                System.out.println(userInput + " is in slot " + index);
            }
        }
        if (index == -1) {
            System.out.println(userInput + " is not in the array");
        }
    }
}
