package miniproject1;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Question {
    private String answer;
    private String wrongGuesses;
    private String correctGuesses;
    private int chances;

    // constructor
    public Question() {
        this.answer = randomCity();
        this.wrongGuesses = "";
        this.correctGuesses = "";
        this.chances = 0;
    }

    // getters and setters
    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getCorrectGuesses() {
        return correctGuesses;
    }

    public void setCorrectGuesses(String correctGuesses) {
        this.correctGuesses += correctGuesses;
    }

    public String getWrongGuesses() {
        return wrongGuesses;
    }

    public void setWrongGuesses(String wrongGuesses) {
        this.wrongGuesses += wrongGuesses;
    }

    public int getChances() {
        return chances;
    }

    public void setChances() {
        this.chances++;
    }

    // methods
    public static List readAll(String file) {
        List<String> citiesList = Collections.emptyList();
        try {
            citiesList = Files.readAllLines(Paths.get(file), StandardCharsets.UTF_8);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return citiesList;
    }

    public static String randomCity() {
        List<String> citiesList = readAll("src/miniproject1/cities");
        Random random = new Random();
        String randomCity = citiesList.get(random.nextInt(citiesList.size()));
        return randomCity;
    }

    public String displayAnswer() {
        String cityAnswer = answer;
        for (int i = 0; i < answer.length(); i++) {
            String g = answer.substring(i, i + 1);
            if (!correctGuesses.contains(g) && !g.equals(" ")) {
                cityAnswer = cityAnswer.replace(g, "_");
            }
        }
        return cityAnswer;
    }
}
