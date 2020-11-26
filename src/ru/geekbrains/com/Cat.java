package ru.geekbrains.com;

public class Cat {
    private String name;
    private int appetite; // аппетит кота
    private boolean bellyFull; // наелся
    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        bellyFull = false;
    }
    public void eat(Plate plate) {
    if (plate.foodSatisfyAppetite(appetite) && !bellyFull) {
        plate.takeFood(appetite);
        bellyFull=true;
        System.out.println(name + " поел =3");
    } else if (bellyFull) {
        System.out.println(name + " наелся и спит ZzZ...");
    } else {
        System.out.println(name + " не поел =(");
    }
    }
}
