package ru.geekbrains.com;

public class Plate {
    private int food;
    public Plate(int food) {
        this.food = food;
    }
    public void addFood(int food) {
        this.food+=food;
        // food+=food;
    }
    public void takeFood(int appetite) {
        if (!foodSatisfyAppetite(appetite)) {
            System.out.println("Еды не хватает, чтобы накормить котов");
            return;
        }
        food = food - appetite;
    }
    public boolean foodSatisfyAppetite(int appetite) {
        return food>=appetite;
    }
}
