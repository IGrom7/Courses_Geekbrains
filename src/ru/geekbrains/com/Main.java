package ru.geekbrains.com;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Ваша задача угадать число.");
        playLevel(9, 3,0);
        scanner.close();
    }

    private static int playLevel(int range, int lives, int g) {
        int number = (int) (Math.random() * range);
        while (lives > 0) {
            System.out.println("Колличество попыток " + lives);
            System.out.println("Угадайте число от 0 до " + range);
            int intpun_number = scanner.nextInt();
            if (intpun_number == number) {
                System.out.println("Вы выиграли!");
                break;
            } else if (intpun_number > number) {
                lives--;
                System.out.println("Число меньше загаданного...");
            } else if (intpun_number < number) {
                lives--;
                System.out.println("Число больше загаданного...");
            }
            if (lives==0) {
                System.out.println("Вы проиграли =(");
                System.out.println("Сыграть ещё раз? 1-Да!,2-Нет.");
                int againGame = scanner.nextInt();
                g=againGame;
            }
            if (g==1) {
                return playLevel(9,3,0);
            }
        }
        return (lives);
    }
}


