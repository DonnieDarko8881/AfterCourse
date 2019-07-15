package singleton;

import java.util.Random;
import java.util.Scanner;

public class GuessGame {

    private static GuessGame instance;
    private int score = 0;


    private GuessGame() {
    }

    public static GuessGame getInstance() {
        if (instance == null) {
            synchronized (GuessGame.class) {
                if (instance == null) {
                    instance = new GuessGame();
                }
            }
        }
        return instance;
    }

    public void play() {
        Random generator = new Random();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            int guessGenerate = generator.nextInt(10);
            int guess = scanner.nextInt();
            if (guess == guessGenerate) {
                System.out.println("dobrze");
                score++;
            }else {
                System.out.println("Przykro mi, myslalem o " + guessGenerate);
            }
        }
        System.out.println(getScore());
    }

    private int getScore() {
        return score;
    }

    public Object readResolve() {
        return getInstance();
    }

    public static void main(String[] args) {
        GuessGame game = GuessGame.getInstance();

        game.play();

        int score = game.getScore();

        GuessGame anotherGameReference = GuessGame.getInstance();

        if (game == anotherGameReference) {
            System.out.println("Singleton!");
            if (score == anotherGameReference.getScore()) {
                System.out.println("I punkty się zgadzają!");
            }
        }
    }
}


