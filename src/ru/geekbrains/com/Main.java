package ru.geekbrains.com;

public class Main {

    public static void main(String[] args) {
        // Длина/высота в метрах.
        Cat cat = new Cat(2, 200, 0);
        Dog dog = new Dog(4, 500, 10);
        System.out.println("Кошка:");
        cat.run(50);
        cat.run(200);
        cat.swim(100);
        cat.jump(1);
        cat.jump(3);

        System.out.println("Собака:");

        dog.run(300);
        dog.run(500);
        dog.swim(9);
        dog.swim(100);
        dog.jump(1);
        dog.jump(5);

        Animal newCat = new Cat(3, 230, 10);
        Animal newDog = new Dog(5, 600, 20);

        System.out.println("Кошка 2.0:");

        System.out.println("Максимальное расстояние бега: " + newCat.maxRun + " и максимальное расстояние прыжка: " + newCat.maxJump);

        newCat.run(200);
        newCat.run(50);
        newCat.swim(1);
        newCat.jump(1);
        newCat.jump(3);

        System.out.println("Собака 2.0:");
        System.out.println("Плавание: " + newDog.maxSwim + ", Бег: " + newDog.maxRun + " и высота прыжка: " + newDog.maxJump);


        newDog.run(450);
        newDog.run(550);
        newDog.swim(9);
        newDog.swim(100);
        newDog.jump(4);
        newDog.jump(5);
    }
}