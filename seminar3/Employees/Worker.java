package ru.geekbrains.seminar3.Employees;

import java.util.ArrayList;
import java.util.List;

/**
 * Worker - класс сотрундников, имеющих фиксированную оплату
 * «среднемесячная заработная плата = фиксированная месячная оплата».
 */
public class Worker extends Employee {

    // Конструктор класса Worker
    private Worker(String name, String surname, double salary){
        super(name, surname, salary);
    }

    /**
     *  getInstance - метод создания работника, путем случайного подбора имени,
     *  фамилии и зарплаты из заданных списков.
     * @return
     */
    public static Employee getInstance(){
        return new Worker(
                names[random.nextInt(names.length)],
                surnames[random.nextInt(surnames.length)],
                random.nextDouble(30000, 250000));
    }

    /**
     * getEmployees - метод, создающий коллекцию работников, имеющих фиксированную зарплату.
     * @param count - число работников, которое нужно сгенерировать.
     * @return
     */
    public static List<Employee> getEmployees(int count){
        List<Employee> employees = new ArrayList<>();
        for (int i = 0; i < count; i++){
            employees.add(getInstance());
        }
        return employees;
    }

    /**
     *  calculateSalary - метод определения зарплаты.
     *  «среднемесячная заработная плата = фиксированная месячная оплата».
     * @return
     */
    @Override
    public double calculateSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return String.format("%s %s; Рабочий; Среднемесячная заработная плата (фиксированная месячная оплата): " +
                "%.2f (рублей)", name, surname, salary);
    }
}
