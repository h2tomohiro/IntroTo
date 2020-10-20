package MiniProject1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class GuessCity {

    private String[] cts;
    private String ct = "";
    private int chance = 10, wrong = 0;

    ArrayList<String> wrongLetters = new ArrayList<String>();
    ArrayList<String> correctLetters = new ArrayList<String>();

    public static void main(String[] args) {
        GuessCity m = new GuessCity();
        m.game();

    }

    public GuessCity() {
        ListCities();
        RandomCity();
    }

    public void ListCities() {
        try {
            File f = new File("src/MiniProject1/cities");
            Scanner in = new Scanner(f);
            String c = " ";
            while (in.hasNextLine()) {
                c += in.nextLine() + ".";
            }
            c = c.substring(0, c.length() - 1);
            cts = c.split("\\.");
            System.out.println("The file contains this cities names:\n" + c);

        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        }
    }

    public void RandomCity() {
        Random r = new Random();
        int i = (int) r.nextInt(this.cts.length - 1);
        this.ct = cts[i];
    }

    private String checkLetters() {
        String string = "";

        for (int i = 0; i < ct.length(); i++) {
            String currentChar = Character.toString(ct.toLowerCase().charAt(i));
            if (correctLetters.contains(currentChar)) {
                string += currentChar + " ";
            } else {
                string += "_ ";
            }
        }

        return string;
    }

    private boolean WordFind() {
        boolean find = true;
        for (int i = 0; i < ct.length(); i++) {
            String currentChar = Character.toString(ct.toLowerCase().charAt(i));
            if (!correctLetters.contains(currentChar)) {
                find = false;
            }
        }

        return find;
    }

    private String checkWrongLetters() {
        String string = "";
        for (int i = 0; i < wrongLetters.size(); i++) {
            string += wrongLetters.get(i) + ", ";
        }
        if (string.length() > 2)
            string = string.substring(0, string.length() - 2);

        return string;
    }

    public void validate(String l) {
        if (!wrongLetters.contains(l) && !correctLetters.contains(l)) {
            if (ct.toLowerCase().contains(l.toLowerCase())) {
                correctLetters.add(l);
            } else {
                wrongLetters.add(l);
                wrong += 1;
            }
        }
    }

    public boolean GameOver() {
        boolean Over = false;
        if (wrong >= chance) {
            Over = true;
            System.out.println("You lose!\nThe correct word was '" + ct + "'!");
        } else if (WordFind()) {
            Over = true;
            System.out.println("You win!\nYou have guessed '" + ct + "' correctly.");
        }

        return Over;
    }

    public void game() {
        System.out.println("Here's the question.");

        System.out.println(this.checkLetters());
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Guess a letter: ");
            String val = scanner.nextLine();

            if (val.length() > 1) {
                System.out.println("You should type only a letter per time. Try again!");
                continue;
            }

            validate(val);

            if (GameOver()) {
                break;
            }

            System.out.println("You are guessing: " + checkLetters());
            System.out.println("You have guessed (" + wrong + "), wrong letters: " + checkWrongLetters());
        }
    }
}