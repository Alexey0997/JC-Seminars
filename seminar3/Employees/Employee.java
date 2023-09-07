package ru.geekbrains.seminar3.Employees;

import java.util.Random;

public abstract class Employee implements Comparable<Employee>{
    // Поля класса Employee.
    private int id;
    protected String name;              // Имя сотрудника.
    protected String surname;           // Фамилия сотрудника.
    protected double salary;            // Размер заработной платы.
    protected static String[] names = new String[] {"Агата", "Алефтина", "Александра", "Борис", "Богдан", "Вадим",
            "Вячеслав", "Галина", "Геннадий", "Диана", "Дмитрий", "Ева", "Екатерина", "Елена"};
    protected static String[] surnames = new String[] {"Агатова", "Алефтинин", "Александров", "Борисов", "Богданов",
            "Вадим", "Славин", "Галинина", "Герундий", "Иванова", "Петров", "Сидоров", "Пушкин", "Лермонтов"};
    protected static Random random = new Random();
    private static int counter = 1000;



    // Конструкторы класса Employee
    {
        id = ++counter;
    }
    private Employee(){
        this ("#Name#", "#Surname#");
    }
    private Employee(String name, String surname){
        this (name, surname, 500);
    }
    Employee(String name, String surname, double salary){
        if (salary < 500)
            throw new RuntimeException("Ставка заработной платы должна быть" +
                    "не менее 500.");
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    // Getters & Setters' region
    public int getId() {
        return id;
    }

    public static String[] getNames() {
        return names;
    }

    public String getSurname() {
        return surname;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary < 30000){
            throw new RuntimeException("Уровень заработной платы должен быть не менее 30000");
        }
        this.salary = salary;
    }

    // Методы класса Employee.

    /**
     * calculateSalary - абстрактный метод расчета заработной платы.
     * @return
     */
    public abstract double calculateSalary();

    /**
     * toString - метод определения порыдка вывода данных на печать.
     * @return
     */
    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                '}';
    }

    /**
     * compareTo - метод сравнения фамилий и зарплаты сотрудников, необходимый для сортировки.
     * @return
     */

    public int compareTo(Employee other) {
        if (other == null) {
            throw new NullPointerException("Нельзя сравнивать с нулем.");
        }
        int surnameComparison = this.surname.compareTo(other.surname);
        if (surnameComparison != 0) {
            return surnameComparison;
        }
        return Double.compare(this.calculateSalary(), other.calculateSalary());
    }
}
