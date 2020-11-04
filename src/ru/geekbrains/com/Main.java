package ru.geekbrains.com;

public class Main {

    public static void main(String[] args) {
        replace0to1();
        varMaxOrMinInArr(0, 0);
        fillingArray();
        varLessSixMultiplyByTwo(1);
        squareArrayDiagonal1();
        balanceArray();
    }

    public static void replace0to1() { // Почему то 1 элемент массива все равно 1 не понимаю почему.
        System.out.println("Замена 1 на 0 и 0 на 1");
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int r : arr) {
            if (r == 0) {
                arr[r] = 1;
            } else {
                arr[r] = 0;
            }
            System.out.println(arr[r]+" ");
        }
    }

    public static void varMaxOrMinInArr(int min, int max) {
        int[] B = {9, 20, 30, 255, 22, 11, 100};
        for (int k = 0; k < B.length; k++) {
            if (min > B[k]) {
                min = B[k];
            }
            if (max < B[k]) {
                max = B[k];
            }
            //max = Math.max(max, B[k]);
        }
        System.out.println("Максимальное число " + max);
        System.out.println("Минимальное число " + min);
    }
    public static void fillingArray() {
        int[] Array = new int[8];
        System.out.println("Массив с шагом плюс 3");
        for (int i=0; i<Array.length; i++) {
            Array[i] = i * 3;
            System.out.println(Array[i]);
        }
        }
        public static void varLessSixMultiplyByTwo(int m) {
        int[] array = {1,5,4,22,4,5,2,4,8,9,1};
        System.out.println("Числа меньше 6 умножаются на 2");
        for (int s=0; s< array.length; s++){
            if (array[s]<6) {
                array[s]=array[s]*2;
            }
            System.out.println(array[s]);
        }
        }
        public static void squareArrayDiagonal1() {
            int[][] sq = new int[5][5];
            System.out.println("Заполнение таблицы массива единицами");
            for (int i = 0; i < sq.length; i++) {
                sq[i][i] = 1;
                sq[i][sq[i].length - 1 - i] = 1;
                System.out.println(sq[i][i]);
            }
        }
        public static boolean balanceArray() {
        System.out.println("Проверка на равенство правой и левой части массива");
        int [] arr={5,2,1,1,1,1,10,2};
        int lSum = 0;
        for(int p=0; p< arr.length; p++) {
            lSum+=arr[p];
            int rSum = 0;
            for (int l=(p+1); l<arr.length; l++) {
                rSum += arr[l];
            }
            if (lSum==rSum) {
                return true;
            }
        }
            return false;
        }
}

