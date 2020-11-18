package ru.geekbrains.com;

public class Cat extends Animal
{
    public Cat(int maxJump, int maxRun, int maxSwim)
    {
        super(maxJump, maxRun , 0);
    }

    @Override
    public void swim(int length)
    {
        System.out.println("Кот(шка) не хочет плавать!!!");
    }
}
