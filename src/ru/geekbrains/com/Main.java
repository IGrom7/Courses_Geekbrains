package ru.geekbrains.com;

import java.util.Random;
import java.util.Scanner;

public class Main  {
    public static int SIZE = 5;
    public static int DOTS_TO_WIN = 3;
    public static final char DOT_EMPTY = '•';
    public static final char DOT_X = 'X';
    public static final char DOT_O = 'O';
    public static char[][] map;
    public static Scanner sc = new Scanner(System.in);
    public static Random rand = new Random();
    public static void main(String[] args) {
        initMap();
        printMap();
        while (true) {
            humanTurn();
            printMap();
            if (checkWin(DOT_X)) {
                System.out.println("Победил человек");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
            aiTurn();
            printMap();
            if (checkWin(DOT_O)) {
                System.out.println("Победил ИИ");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
        }
        System.out.println("Игра закончена");
    }



    public static boolean isMapFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY) return false;
            }
        }
        return true;
    }
    public static void aiTurn() {
        int x, y;
        do {
            x = rand.nextInt(SIZE);
            y = rand.nextInt(SIZE);
        } while (!isCellValid(x, y));
        System.out.println("Компьютер походил в точку " + (x + 1) + " " + (y + 1));
        map[y][x] = DOT_O;
    }
    public static void humanTurn() {
        int x, y;
        do {
            System.out.println("Введите координаты в формате X Y");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        } while (!isCellValid(x, y));
        map[y][x] = DOT_X;
    }
    public static boolean isCellValid(int x, int y) {
        if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) return false;
        if (map[y][x] == DOT_EMPTY) return true;
        return false;
    }
    // Проверка на победу
    public static boolean checkWin(char symb) {
        int endOfOffset = map.length - DOTS_TO_WIN;
        for (int rowOf=0; rowOf<=endOfOffset; rowOf++) {
            if (isDiagFillWith(symb, rowOf)) {
                return true;
            }
            for (int colOf=0; colOf<=endOfOffset; colOf++) {
                boolean hasWin = isLineFillWith(symb, rowOf, colOf);
                if (hasWin) {
                    return true;
                }
            }
        }
        return false;
    }
    public static void initMap() {
        map = new char[SIZE][SIZE];
        for (int row = 0; row < SIZE; row++) {
            for (int columns = 0; columns < SIZE; columns++) {
                map[row][columns] = DOT_EMPTY;
            }
        }
    }
    public static void printMap() {
        for (int i = 0; i <= SIZE; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int row = 0; row < SIZE; row++) {
            System.out.print((row + 1) + " ");
            for (int column = 0; column < SIZE; column++) {
                System.out.print(map[row][column] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    static boolean isDiagFillWith(char symb, int rowOffset) {
        int mainDiogonalCou=0;
        int sideDiagonalCou=0;
        final int subSquareLength = (DOTS_TO_WIN+rowOffset);
        for (int row=rowOffset; row<subSquareLength; row++) {
            if (map[row][row]==symb) {
                mainDiogonalCou++;
            }
            else {
                mainDiogonalCou=0;
            }
            if (map[row][map.length-1-row]==symb) {
                sideDiagonalCou++;
            }
            else {
                sideDiagonalCou=0;
            }
        }
        return (mainDiogonalCou==DOTS_TO_WIN) || (sideDiagonalCou == DOTS_TO_WIN);
    }
    static boolean isLineFillWith(char symb, int rowOffset, int colOffset) {
        for (int row = rowOffset; row< (DOTS_TO_WIN + rowOffset); row++) {
            int horizontWinCounter = 0;
            int verticalWinCounter = 0;
            for (int column=colOffset; column<(DOTS_TO_WIN +colOffset); column++) {
                if (map[row][column] == symb) {
                    horizontWinCounter++;
                }
                else {
                    horizontWinCounter=0;
                }
                if (map[column][row]==symb) {
                    verticalWinCounter++;
                }
                else {
                    verticalWinCounter=0;
                }
                if ((horizontWinCounter==DOTS_TO_WIN)||(verticalWinCounter==DOTS_TO_WIN)) {
                    return true;
                }
            }
        }
        return false;
    }
}

