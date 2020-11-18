package ru.geekbrains.com;

public abstract class Animal {
    protected int maxJump;
    protected int maxRun;
    protected int maxSwim;
    public Animal(int maxJump, int maxRun, int maxSwim) {
        this.maxJump = maxJump;
        this.maxRun = maxRun;
        this.maxSwim = maxSwim;
    }

    public void run(int length) {
        System.out.println("Бег: " + isAvailableAction(length, maxRun));
    }

    public void swim(int length) {
        System.out.println("Плавание: " + isAvailableAction(length, maxSwim));
    }

    public void jump(int height) {
        System.out.println("Прыжок: " + isAvailableAction(height, maxJump));
    }

    private boolean isAvailableAction(int required, int expected) {
        return required <= expected;
    }
}
