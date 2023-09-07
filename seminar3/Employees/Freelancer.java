package ru.geekbrains.seminar3.Employees;

import java.util.ArrayList;
import java.util.List;

/**
 * Freelancer - класс сотрундников, имеющих фиксированную оплату
 * «среднемесячная заработная плата = фиксированная месячная оплата».
 */
public class Freelancer extends Employee {
    // Конструктор класса Freelancer
    private Freelancer(String name, String surname, double salary){
        super(name, surname, salary);
    }

    /**
     *  getInstance - метод создания работника, путем случайного подбора имени,
     *  фамилии и зарплаты из заданных списков.
     * @return
     */
    public static Employee getInstance(){
        return new Freelancer(
                names[random.nextInt(names.length)],
                surnames[random.nextInt(surnames.length)],
                random.nextDouble(200, 3000));
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
        return String.format("%s %s; Рабочий; Среднемесячная заработная плата (почасовая ставка): " +
                "%.2f (рублей)", name, surname, 20.8 * 8 * salary);
    }
}
