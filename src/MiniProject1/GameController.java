package miniproject1;

import java.util.Scanner;

public class GameController {

    private Question question = new Question();
    private String wrongGuesses = question.getWrongGuesses();


    private String getGuess() {
        System.out.print("Guess a letter: ");
        Scanner scan = new Scanner(System.in);
        String guess = scan.next();
        return guess;
    }

    public void newGame() {
        System.out.println("Here's the question.");
        String answer = question.getAnswer();
        System.out.println(question.displayAnswer());
        while (!question.displayAnswer().equals(question.getAnswer()) && question.getChances() < 10) {
            validateGuess(getGuess());
        }
        if (question.displayAnswer().equals(question.getAnswer())) {
            System.out.println("You win! \nYou have guessed '" + answer + "' correctly!");
        } else if (question.getChances() >= 10) {
            System.out.println("You lose! \nThe correct word was '" + answer + "'!");
        }
    }

    private boolean isGuessValidChar(String guess) {
        String specialChars = "/*!@#-$%^&*()\"{}_[]|\\?/<>,.";
        for (int i = 0; i < guess.length(); i++) {
            if (specialChars.contains(guess.substring(i, 1))) {
                return false;
            }
        }
        return true;
    }

    private void validateGuess(String guess) {
        if (guess.length() > 1) {
            System.out.println("Oops, you have entered an invalid input.");
        } else if (!isGuessValidChar(guess)) {
            System.out.println("Oops, you have entered an invalid input.");
        } else if (question.getCorrectGuesses().contains(guess)) {
            System.out.println("Oops, you have already guessed that letter.");
        } else if (wrongGuesses.contains(guess)) {
            question.setChances();
            question.setWrongGuesses(guess + " ");
            System.out.println("You have guessed (" + question.getChances() + ") " +
                    "wrong letters: " + question.getWrongGuesses());
        } else {
            checkGuess(guess);
            System.out.println("You are guessing: " + question.displayAnswer());
        }
    }

    private void checkGuess(String guess) {
        String answer = question.getAnswer();
        char g = guess.charAt(0);
        if (answer.contains(guess)) {
            for (int i = 0; i < answer.length(); i++) {
                if (String.valueOf(answer.charAt(i)).equals(guess)) {
                    String.valueOf(question.displayAnswer().charAt(i)).replace('_', g);
                    question.setCorrectGuesses(guess);
                }
            }
        } else {
            question.setChances();
            question.setWrongGuesses(guess + " ");
            System.out.println("You have guessed (" + question.getChances() + ") " +
                    "wrong letters: " + question.getWrongGuesses());
        }
    }
}
