package task1;

import java.util.Random;
import java.util.Scanner;

public class Guess {

    public static void main(String[] args) throws Exception {
        gameCycle();
    }

    public static void gameCycle() {
        int number = new Random().nextInt(100);
        int maxAttempts = 10;
        System.out.println("Я загадал число от 1 до 99. У тебя "+ maxAttempts +" попыток угадать.");

        boolean guessed = false;
        Scanner sc = new Scanner(System.in);

        for(int i = 1; i <= maxAttempts; i++) {
            int guess = sc.nextInt();
            if (guess == number) {
                System.out.println("Ты угадал с " + i + " попытки!");
                guessed = true;
                break;
            } else if (guess > number) {
                System.out.println("Мое число меньше! Осталось " + (maxAttempts - i) + " попыток");
            } else {
                System.out.println("Мое число больше! Осталось " + (maxAttempts - i) + " попыток");
            }
        }
        if(!guessed)System.out.println("Ты не угадал.");
    }
}