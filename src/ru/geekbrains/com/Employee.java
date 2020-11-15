package ru.geekbrains.com;

public class Employee {
    private String FIO;
    private String position;
    private String email;
    private String telephone;
    private float salary;
    private int age;
    public Employee(String FIO, String position, String email, String telephone, float salary, int age) {
        this.FIO = FIO;
        this.position = position;
        this.email = email;
        this.telephone = telephone;
        this.salary = salary;
        this.age = age;
    }
    public void printInfo() {
        System.out.println("Ф.И.О. "+FIO);
        System.out.println("Должность: "+position);
        System.out.println("Эл. почта: "+email);
        System.out.println("Тел.: "+telephone);
        System.out.println("Заработная плата: "+salary);
        System.out.println("Возраст: "+age);
        System.out.println();
    }
    public int getAge() {
        return age;
    }
}
