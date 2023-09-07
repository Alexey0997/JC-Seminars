package ru.geekbrains.seminar3;

import ru.geekbrains.seminar3.Comparators.EmployeeSalaryComparator;
import ru.geekbrains.seminar3.Comparators.EmployeeSurnameComparator;
import ru.geekbrains.seminar3.Employees.Employee;
import ru.geekbrains.seminar3.Employees.Freelancer;
import ru.geekbrains.seminar3.Employees.Worker;

import java.util.List;

public class Program {
    public static void main(String[] args){
        List<Employee> workers = Worker.getEmployees(5);
        System.out.println("ПЕРЕЧЕНЬ РАБОЧИХ С ФИКСИРОВАННОЙ ЗАРПЛАТОЙ:");
        System.out.println("Применена сортировка данных по фамилиям.");
        workers.sort(new EmployeeSurnameComparator());
        for (Employee employee: workers) {
            System.out.println(employee);
        }

        System.out.println();
        List<Employee> freelancers = Freelancer.getEmployees(5);
        System.out.println("СПИСОК СОТРУДНИКОВ С ПОЧАСОВОЙ СТАВКОЙ:");
        System.out.println("Применена сортировка данных по увеличению зарплаты.");
        freelancers.sort(new EmployeeSalaryComparator());
        for (Employee employee: freelancers) {
            System.out.println(employee);
        }
    }
}
