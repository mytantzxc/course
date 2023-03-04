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
        System.out.println("� ������� ����� �� 1 �� 99. � ���� "+maxAttempts +" ������� �������.");

        boolean guessed = false;
        Scanner sc = new Scanner(System.in);

        for(int i = 1; i <= maxAttempts; i++) {
            int guess = sc.nextInt();
            if (guess == number) {
                System.out.println("�� ������ � " + i + " �������!");
                guessed = true;
                break;
            } else if (guess > number) {
                System.out.println("��� ����� ������! �������� " + (maxAttempts - i) + " �������");
            } else {
                System.out.println("��� ����� ������! �������� " + (maxAttempts - i) + " �������");
            }
        }
        if(!guessed)System.out.println("�� �� ������.");
    }
}