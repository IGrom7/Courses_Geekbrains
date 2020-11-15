package ru.geekbrains.com;

public class Main {

    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Громко Игорь Дмитриевич", "Студент", "Mail1@mail.gb", "+77777777777", 5000, 22);
        employees[1] = new Employee("Березин Иван Игоревич", "Программист", "Mail2@mail.gb", "+77777777777", 50000, 56);
        employees[2] = new Employee("Языкова Алина Викторовна", "Администратор", "Mail3@mail.gb", "+77777777777", 100000, 38);
        employees[3] = new Employee("Юлятова Рофл Владимировна", "Гл. бухгалтер", "Mail$$$@mail.gb", "+12345678910", 50000000, 68);
        employees[4] = new Employee("Белов Александр Юрьевич", "Водитель", "Mail3@mail.gb", "+77777777777", 500, 35);
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getAge() > 40) {
                employees[i].printInfo();
            }
        }
    }
}