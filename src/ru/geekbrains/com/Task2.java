package ru.geekbrains.com;

import java.util.Random;
import java.util.Scanner;
//String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
//Я так понял это как то математически решается, но я не решил =( что то типо n-1.
public class Task2 {
    private static Random rand = new Random();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        //int r=rand.nextInt(25);//0-24 слов, 25 слов.
        System.out.println("Ваша задача угадайть слово.");
        guessTheWord('f','f', 0);


    }
    public static String guessTheWord(char letter,char inLetter, int k){
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        int r=rand.nextInt(25);
        String randomWords=words[r];
        System.out.println(randomWords.length());
        for (int i=0; i<randomWords.length(); i++) {
            letter = randomWords.charAt(i);
        }
        System.out.println(randomWords);
        while (true) {
            String inputWord = scanner.nextLine();
            for (int i=0; i<inputWord.length(); i++) {
                inLetter = inputWord.charAt(i);
            }
            if (randomWords.equals(inputWord)) {
                System.out.println("Вы выиграли!");
                break;
            }
            else if (letter==inLetter) {
                System.out.println(letter+"###############"); //############### 15 сивмолов
            }
        }
        return (randomWords);
    }
}
