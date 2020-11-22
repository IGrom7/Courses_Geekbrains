package ru.geekbrains.com;



public class Main {
    public static void main(String[] args) {
        Plate plate = new Plate(15);
        Cat[] cats = new Cat[3];
        cats[0] = new Cat("Анис", 5);
        cats[1] = new Cat("Фараон", 20);
        cats[2] = new Cat("Рыжик", 30);


        for (int i = 0; i < cats.length; i++) {
            cats[i].eat(plate);
        }
        addFoodTo(plate, 10);
        for (int i = 0; i < cats.length; i++) {
            cats[i].eat(plate);
        }
       addFoodTo(plate, 30);
            cats[2].eat(plate);
    }
    static void addFoodTo(Plate plate, int food) {
        plate.addFood(food);
    }
}
